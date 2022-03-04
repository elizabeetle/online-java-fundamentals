package labs_examples.objects_classes_methods.labs.oop.A_inheritance;

import java.awt.*;

class Restaurant {
    private String cuisine;
    private String restaurantName;
    private String town;
    private boolean expensive;

    public Restaurant(){

    }
}

class MenuItem extends Restaurant{
    private String itemName;
    private int price;

    public MenuItem(){
    }
    public MenuItem(String itemName, int price){
    }

}

class Tables extends Restaurant{
    private int numberOfTablesAvailable;
    private int averageWaitTime;

    public Tables(){
    }

    public Tables(int numberOfTablesAvailable, int averageWaitTime){
    }

}

class ServerName extends Tables{
    private String serverName;
    private int hourlyPay;
    private int hoursWorked;

    public ServerName(){
    }
    public ServerName(String serverName, int hourlyPay, int hoursWorked){
    }

}

class FilledChairsPerTable extends Tables{
    private int filledChairsAtTable;
    private int totalChairsAtTable;

    public FilledChairsPerTable(){

    }
}
