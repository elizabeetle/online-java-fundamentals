package labs_examples.enumerations.labs;

/**
 * Enumerations Exercise 1:
 *
 *      1) Create an enumeration. Use a controller class to demonstrate the use of the enum from a seperate class.
 *      2) Create a parameterized enumeration that passes one or more values to it's constructor. Demonstrate the use
 *      of this enum from a seperate class.
 */

enum SimpleEmotions{
    MAD,
    SAD,
    HAPPY,
    FEARFUL
}

enum CityLiving{
    CHICAGO(1874, "Apartment"),
    NEW_YORK(2300, "Shoebox"),
    BOSTON(1700, "One bedroom apartment"),
    BALTIMORE(1000, "One bedroom apartment");


    private Number price;
    private String typeOfLivingSpace;

    CityLiving(Number price, String typeOfLivingSpace){
        this.price = price;
        this.typeOfLivingSpace = typeOfLivingSpace;
    }

    public Number getPrice() {
        return price;
    }

    public String getTypeOfLivingSpace() {
        return typeOfLivingSpace;
    }

    public void getBoth(){
        System.out.println((getTypeOfLivingSpace() + "" + getPrice()));
    }
}
