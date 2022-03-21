package labs_examples.objects_classes_methods.labs.oop.C_blackjack;



public class Card {

    private char suit;
    private int cardValue;

    @Override
    public String toString() {
        return "Card {suit = " + getSuit() +
                ", cardValue = " + getCardValue() +
                '}';
    }

    public char getSuit() {
        return suit;
    }

    public void setSuit(char suit) {
        this.suit = suit;
    }

    public int getCardValue() {
        return cardValue;
    }

    public void setCardValue(int cardValue) {
        this.cardValue = cardValue;
    }

}

