package labs_examples.objects_classes_methods.labs.oop.C_blackjack;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;


public class Deck{

    Card[] deck = new Card[52];
    ArrayList<Integer> usedCards = new ArrayList();


    int randomNum;
    int count;
    String answer;
    private char[] suit = new char[]{'♠', '♦', '♥', '♣'};



    public void populateCards() {
        count = 0;

        for (int i = 0; i < suit.length; i++) {
            for (int j = 1; j < 11; j++) {
                Card card = new Card();
                card.setSuit(suit[i]);
                card.setCardValue(j);

                deck[count] = card;
                count += 1;
            }
            for(int h = 0; h < 3; h++){
                Card faceCard = new Card();
                faceCard.setSuit(suit[i]);
                faceCard.setCardValue(10);

                deck[count] = faceCard;
                count += 1;
            }
        }
    }
        public void deal(Player player) {

            //runs this do-while statement while usedCards[] contains the random number
            do{
                Random rand = new Random();
                int upperbound = 52;
                randomNum = rand.nextInt(upperbound);
                //checks usedCards[] for the random number to see if it's been drawn
                if(!usedCards.contains(randomNum)){
                    usedCards.add(randomNum);

                    Card temp = deck[randomNum];
                    System.out.println(temp.toString());
                    player.hand.addCardToHand(temp);
                    player.hand.calculateHand(deck[randomNum]);
                    break;
            }

            }while(!usedCards.contains(randomNum));

        }



     public void initialDeal(Player player){

        for(int i = 0; i < 2; i++){
            do{
                Random rand = new Random();
                int upperbound = 52;
                randomNum = rand.nextInt(upperbound);

                if(!usedCards.contains(randomNum)){
                    usedCards.add(randomNum);

                    Card temp = deck[randomNum];
                    player.hand.addCardToHand(temp);
                    break;
                }

            }while(usedCards.contains(randomNum));
        }
     }

    public void hit(Player player){

        do{
            System.out.println("Would you like to hit (y/n)?");
            answer = BlackjackController.scan.nextLine();

            if(answer.equalsIgnoreCase("y")){
                deal(player);
                System.out.println("Your new total is: " + player.hand.getHandValue());
                player.hand.checkForBlackjack(player);
                player.hand.checkBust(player);

            }else if(answer.equalsIgnoreCase("n")){
                System.out.println("Your total is: " + player.hand.getHandValue());
               //more needs to go here, probs leads into the computer's turn
                BlackjackController.checkWin();
            }

        }while(answer.equalsIgnoreCase("y"));
    }

    public void computerAI(Player player){
        int currentHand = player.hand.calculateInitialHand();

        do{
            dealAI(player);
            player.hand.checkBustAI(player);
            break;
        }while (currentHand < 16);
    }

    public void dealAI(Player player){
        do{
            Random rand = new Random();
            int upperbound = 52;
            randomNum = rand.nextInt(upperbound);
            //checks usedCards[] for the random number to see if it's been drawn
            if(!usedCards.contains(randomNum)){
                usedCards.add(randomNum);

                Card temp = deck[randomNum];
                System.out.println("\nThe casino drew a: " + temp.toString());
                player.hand.addCardToHand(temp);
                player.hand.calculateHand(deck[randomNum]);
  //              System.out.println("\nThe casino's total hand value is: " + player.hand.getHandValue());
                break;
            }
        }while(!usedCards.contains(randomNum));
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }
}



