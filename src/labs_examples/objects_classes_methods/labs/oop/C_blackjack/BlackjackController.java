package labs_examples.objects_classes_methods.labs.oop.C_blackjack;

import java.util.ArrayList;
import java.util.Scanner;



public class BlackjackController {

    static Scanner scan = new Scanner(System.in);
    static String username;


    public static void main(String[] args) {

    Deck blackJackDeck = new Deck();
    blackJackDeck.populateCards();
//    blackJackDeck.deal();

    Hand newHand = new Hand();




    }

    public static void playBlackJack(){

        Player humanPlayer = new Player();
        Player aiPlayer = new Player();

        System.out.println("Welcome to BlackJack by Beetle! Let's get started.");
        System.out.println("Enter your username: ");
        username = scan.nextLine();
        System.out.println();

    }


    public void closeScan(){
        scan.close();
    }

    public void rules(){
        //put all the rules for player to read if they want
    }

}
