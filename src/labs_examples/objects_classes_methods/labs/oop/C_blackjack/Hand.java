package labs_examples.objects_classes_methods.labs.oop.C_blackjack;

import java.util.ArrayList;
import java.util.List;

public class Hand {

    ArrayList<Card> cards = new ArrayList();
    private int handValue;







/*    public void addCardToHand(){
        addToHand = new Deck();
        List<Integer> list = addToHand.getCards();

    }
*/

    public int returnScore(){




        int total = 0;

        for(Card x : cards){
            total += x.getCardValue();
        }
        return total;
    }

    public boolean bust(){
        boolean bustOrNah;
        int total = returnScore();


        if(total > 21)
            bustOrNah = true;
        else
            bustOrNah = false;


        return bustOrNah;
    }


}
