package labs_examples.objects_classes_methods.labs.oop.C_blackjack;

import java.util.ArrayList;

public class Hand {


    ArrayList<Card> cards = new ArrayList();
    int handValue = 0;




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

    public boolean checkBust(Player player){
        boolean bust;

        if(handValue > 21) {
            bust = true;
            System.out.println("Bust! You lose.");
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
            player.hand.emptyHand();
            BlackjackController.playerWins += 1;
            BlackjackController.continuePlaying();
        }else
            bust = false;

        return bust;
    }


    public boolean checkForBlackjack(){
        boolean blackjack;

        if(handValue == 21) {
            blackjack = true;
            System.out.println("Blackjack! You win!");
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
