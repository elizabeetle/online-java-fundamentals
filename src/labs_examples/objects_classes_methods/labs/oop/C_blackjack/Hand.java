package labs_examples.objects_classes_methods.labs.oop.C_blackjack;

import java.util.ArrayList;

public class Hand {


    ArrayList<Card> cards = new ArrayList();
    int handValue = 0;


    public void addCardToHand(Card card){
        cards.add(card);
    }


    public int returnScore(){

        for(Card x : cards){
            handValue += x.getCardValue();
        }
        return handValue;
    }


    public boolean checkBust(){
        boolean bust;

        if(handValue > 21)
            bust = true;
        else
            bust = false;

        return bust;
    }

    public boolean checkForBlackjack(){
        boolean blackjack;

        if(handValue == 21) {
            blackjack = true;
            System.out.println("Blackjack! You win!");
            //need to put that the program ends and ask to start a new round or keep playing
        } else
            blackjack = false;

        return blackjack;
    }

    public void hit(Player player){
        String answer;

        System.out.println("Would you like to hit (y/n)?");
        answer = BlackjackController.scan.nextLine();

        if(answer.equalsIgnoreCase("y")) {
            player.deck.deal(player);
            System.out.println("Your new total is: " + player.hand.returnScore());

        } else if(answer.equalsIgnoreCase("n")) {
            System.out.println("Your turn is over. Your hand total is: " + player.hand.returnScore());
        }

    }

    public void emptyHand(){
        cards.clear();
    }

}
