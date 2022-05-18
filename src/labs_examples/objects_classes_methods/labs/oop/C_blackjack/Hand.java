package labs_examples.objects_classes_methods.labs.oop.C_blackjack;

import java.util.ArrayList;
import java.util.InputMismatchException;

public class Hand {


    ArrayList<Card> cards = new ArrayList();
    int handValue = 0;
    int betAnswer = 0;




    public int getHandValue() {
        return handValue;
    }

    public void calculateHand(Card card){
        handValue += card.getCardValue();
    }

    public void addCardToHand(Card card){
        cards.add(card);
    }

    public int calculateInitialHand(){

        for(Card x : cards){
            handValue += x.getCardValue();
        }
        return handValue;
    }

    public void bets(Player player){
        System.out.println("What would you like to bet? (10/20/30)");
        betAnswer = BlackjackController.scan.nextInt();
    }

    public boolean checkBust(Player player){
        boolean bust;

        if(handValue > 21) {
            bust = true;
            System.out.println("Bust! You lose.");
            System.out.println("You lost " + betAnswer + ".");
            if (betAnswer == 10)
                player.potValue -= 10;
            if (betAnswer == 20)
                player.potValue -= 20;
            if (betAnswer == 30)
                player.potValue -= 30;
            System.out.println("You have " + player.potValue + " left.");
            betAnswer = 0;
            player.hand.emptyHand();
            BlackjackController.computerWins += 1;
            BlackjackController.continuePlaying();
        }else
            bust = false;

        return bust;
    }

    public boolean checkBustAI(Player player){
        boolean bust;

        if(handValue > 21) {
            bust = true;
            System.out.println("The casino bust! You win.");
            if (betAnswer == 10)
                player.potValue += 10;
            if (betAnswer == 20)
                player.potValue += 20;
            if (betAnswer == 30)
                player.potValue += 30;
            System.out.println("You have " + player.potValue + " left.");
            betAnswer = 0;
            player.hand.emptyHand();
            BlackjackController.playerWins += 1;
            BlackjackController.continuePlaying();
        }else
            bust = false;

        return bust;
    }


    public boolean checkForBlackjack(Player player){
        boolean blackjack;

        if(handValue == 21) {
            blackjack = true;
            System.out.println("Blackjack! You win!");
            if (betAnswer == 10)
                player.potValue += 20;
            if (betAnswer == 20)
                player.potValue += 40;
            if (betAnswer == 30)
                player.potValue += 60;
            System.out.println("You have " + player.potValue + " left.");
            betAnswer = 0;
            BlackjackController.playerWins += 1;
            BlackjackController.continuePlaying();
        } else
            blackjack = false;

        return blackjack;
    }

    public void emptyHand(){
        cards.clear();
    }

    public void clearHandValue(){
        handValue = 0;
    }

}
