package labs_examples.objects_classes_methods.labs.oop.C_blackjack;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;
import java.util.Random;


public class Deck{

    Card[] deck = new Card[52];
    //the above is related to the Card class...
    ArrayList<Integer> usedCards = new ArrayList();
    ArrayList<Integer> handArrayList = new ArrayList();



    int randomNum;
    int count;
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
                randomNum = ThreadLocalRandom.current().nextInt(0,51 + 1);
                //checks usedCards[] for the random number to see if it's been drawn
                if(!usedCards.contains(randomNum)){
                    usedCards.add(randomNum);

                    player.hand.addCardToHand(deck[randomNum]);
                    break;
            }

            }while(usedCards.contains(randomNum));

        }



     public void initialDeal(Player player){

        for(int i = 0; i < 2; i++){
            do{
                Random rand = new Random();
                int upperbound = 52;
                int randomNum = rand.nextInt(upperbound);

                if(!usedCards.contains(randomNum)){
                    usedCards.add(randomNum);

                    player.hand.addCardToHand(deck[randomNum]);
                    break;
                }

            }while(usedCards.contains(randomNum));
        }
     }


    public List<Integer> getCards(){
        return handArrayList;
    }




}



