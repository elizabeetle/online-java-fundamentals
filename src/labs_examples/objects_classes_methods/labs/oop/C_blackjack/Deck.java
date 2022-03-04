package labs_examples.objects_classes_methods.labs.oop.C_blackjack;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

//am I allowed to do this?
public class Deck{

    Card[] deck = new Card[52];
    //the above is related to the Card class...
    ArrayList<Integer> usedCards = new ArrayList();
    ArrayList<Integer> handArrayList = new ArrayList();


    int count;
    //this needs to go in Card because you reference Card() in cards<> in Hand.java
    private char[] suit = new char[]{'♠', '♦', '♥', '♣'};

    Hand addToHand = new Hand();


    private int randHolder;
    public int getRandHolder() {
        return randHolder;
    }
    public void setRandHolder(int randHolder){
        this.randHolder = randHolder;
    }


    public void populateCards() {
        //2d array: 4 rows with 13 cards in each
        //array of card objects called deck
        //object type can have any number of items that have the same characteristics
        //example 1 Card object
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
        System.out.println();
    }
        public void deal(Player player) {
        //random number generator with high/low values
        //pull the matching index from the deck[]
        //check if it has been drawn, if yes, draw new card...
        //place the new random number into the Arraylist usedCards to keep track of deck[] indexes already used

            //need to check if the integer is already in there or not
            //probs need a placeholder for the rand number


            //runs this do-while statement while usedCards[] contains the random number
            do{

                int randomNum = ThreadLocalRandom.current().nextInt(1,52 + 1);
                setRandHolder(randomNum);
                //checks usedCards[] for the random number to see if it's been drawn
                if(!usedCards.contains(randHolder)){
                    usedCards.add(randHolder);

                    addToCards();
                    break;
                }

            }while(usedCards.contains(randHolder));


        }



        public List<Integer> getCards(){
            return handArrayList;
        }

        public void addToCards(){
        handArrayList = new ArrayList<Integer>();
        handArrayList.add(randHolder);
        }



}



