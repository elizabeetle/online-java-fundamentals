package labs_examples.objects_classes_methods.labs.oop.C_blackjack;


import java.util.Scanner;



public class BlackjackController {

    static Scanner scan = new Scanner(System.in);
    static Deck mainDeck = new Deck();
    static Player humanPlayer = new Player();
    static Player aiPlayer = new Player();
    static int gameCount = 0;
    static int computerWins = 0;
    static int playerWins = 0;


    public static void main(String[] args) {
        mainDeck.populateCards();
        greeting();
        playBlackJack();

        closeScan();
    }

    public static void greeting(){
        System.out.println("Welcome to BlackJack by Beetle! Let's get started.");
        System.out.println("Enter your username: ");
        humanPlayer.name = scan.nextLine();
        System.out.println();
        System.out.println("Welcome " + humanPlayer.name + "! Let's get started.");
    }

    public static void continuePlaying(){
        String answerContinuePlaying;

        System.out.println("Would you like to play another round? (y/n) ");
        answerContinuePlaying = scan.nextLine();

        if(answerContinuePlaying.equalsIgnoreCase("y")){
            humanPlayer.hand.emptyHand();
            humanPlayer.hand.clearHandValue();
            mainDeck.setAnswer("");
            aiPlayer.hand.emptyHand();
            aiPlayer.hand.clearHandValue();
            gameCount++;
            System.out.println("\nYou have won " + playerWins + " games. The casino has won " + computerWins + " games.\n");

            playBlackJack();
        }else if(answerContinuePlaying.equalsIgnoreCase("n")){
            System.out.println("Thank you for playing BlackJack by Beetle!");
            System.exit(0);
        }
    }

    public static void playBlackJack() {
        aiPlayer.name = "Computer";

        mainDeck.initialDeal(humanPlayer);
        System.out.println("Your hand: "+ humanPlayer.hand.cards.toString());
        mainDeck.initialDeal(aiPlayer);
        System.out.println("The casino is showing a: " + aiPlayer.hand.cards.get(1).toString());
        mainDeck.computerAI(aiPlayer);
        humanPlayer.hand.checkForBlackjack();
        System.out.println("Your hand's total is: " + humanPlayer.hand.calculateInitialHand());

        mainDeck.hit(humanPlayer);
    }

    public static void checkWin(){
        if(humanPlayer.hand.getHandValue() > aiPlayer.hand.getHandValue()){
            System.out.println("You win! You get double what you put in.");
            playerWins += 1;
            continuePlaying();
        }else if(humanPlayer.hand.getHandValue() < aiPlayer.hand.getHandValue()){
            System.out.println("\nThe casino's hand total was: " + aiPlayer.hand.getHandValue());
            System.out.println("You lose! The casino takes your bet.");
            computerWins += 1;
            continuePlaying();
        }else{
            System.out.println("\nThe casino's hand total was: " + aiPlayer.hand.getHandValue());
            System.out.println("You tie... you break even.");
            continuePlaying();
        }
    }

//how can I write this without static methods
    public static void closeScan(){
        scan.close();
    }

}