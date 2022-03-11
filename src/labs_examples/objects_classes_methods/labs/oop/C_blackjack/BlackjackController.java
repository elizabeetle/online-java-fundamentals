package labs_examples.objects_classes_methods.labs.oop.C_blackjack;

import java.util.ArrayList;
import java.util.Scanner;



public class BlackjackController {

    static Scanner scan = new Scanner(System.in);
    static Deck mainDeck = new Deck();



    public static void main(String[] args) {

        mainDeck.populateCards();


        playBlackJack();




    }

    public static void playBlackJack() {

        Player humanPlayer = new Player();
        Player aiPlayer = new Player();
        aiPlayer.name = "Computer";

        System.out.println("Welcome to BlackJack by Beetle! Let's get started.");
        System.out.println("Enter your username: ");
        humanPlayer.name = scan.nextLine();
        System.out.println();
        System.out.println("Welcome " + humanPlayer.name + "!");

        mainDeck.initialDeal(humanPlayer);
        mainDeck.initialDeal(aiPlayer);

        humanPlayer.hand.checkForBlackjack();
        System.out.println("Your hand's total is: " + humanPlayer.hand.returnScore());

        humanPlayer.hand.hit(humanPlayer);

    }


    public void closeScan(){
        scan.close();
    }

    public void rules(){
        //put all the rules for player to read if they want
    }

}