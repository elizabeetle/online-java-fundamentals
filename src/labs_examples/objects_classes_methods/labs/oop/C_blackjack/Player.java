package labs_examples.objects_classes_methods.labs.oop.C_blackjack;

public class Player {

     String name;
     Hand hand;
     int potValue;



    public boolean computerAI(){
        boolean hit;
        int currentHand;


        if(currentHand < 16)
            hit = true;
        else
            hit = false;

        return hit;
    }

}
