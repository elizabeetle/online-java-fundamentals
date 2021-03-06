package labs_examples.objects_classes_methods.labs.objects;

public class Example_01 {

    public static void main(String[] args) {



        Type myType = new Type();
        MaxSpeed myMaxSpeed = new MaxSpeed();
        FuelCapacity myFuelCapacity = new FuelCapacity();
        CurrentFuelLevel myCurrentFuelLevel = new CurrentFuelLevel();

        myType.isCommercial(true);
        myMaxSpeed.setMaxSpeed(674);
        myFuelCapacity.setFuelCapacity(475);
        myCurrentFuelLevel.setCurrentFuelLevel(324);

        Airplane myAirplane = new Airplane(myType, myMaxSpeed,
                myFuelCapacity, myCurrentFuelLevel);

        System.out.println(myAirplane);

    }
}

class Airplane {
    private Type type;
    private MaxSpeed maxSpeed;
    private FuelCapacity fuelCapacity;
    private CurrentFuelLevel currentFuelLevel;

 //   public Airplane(){} --> default constructor
    //have(don't have to assign all variables(could be filled out later in program))
    // to type in all the variables separately, on different lines

    //constructor; a special type of class, creating an instance of a class
    public Airplane(Type type, MaxSpeed maxSpeed, FuelCapacity fuelCapacity, CurrentFuelLevel currentFuelLevel) {
        this.type = type;
        this.maxSpeed = maxSpeed;
        this.fuelCapacity = fuelCapacity;
        this.currentFuelLevel = currentFuelLevel;
    }

    @Override
    public String toString() {
        return "Airplane{" +
                "type=" + type +
                ", maxSpeed=" + maxSpeed +
                ", fuelCapacity=" + fuelCapacity +
                ", currentFuelLevel=" + currentFuelLevel +
                '}';
    }
}

class FuelCapacity {
    //double
    private double fuelCapacity;

 //   private FuelCapacity(double fuelCapacity) {
 //       this.fuelCapacity = fuelCapacity;
 //   }

    public double getFuelCapacity() {
        return fuelCapacity;
    }

    public void setFuelCapacity(double fuelCapacity) {
        this.fuelCapacity = fuelCapacity;
    }

    @Override
    public String toString() {
        return "FuelCapacity{" +
                "fuelCapacity=" + fuelCapacity +
                '}';
    }
}

class CurrentFuelLevel {
    //double
    private double currentFuelLevel;

 //   public CurrentFuelLevel(double currentFuelLevel) {
 //       this.currentFuelLevel = currentFuelLevel;
 //   }

    public double getCurrentFuelLevel() {
        return currentFuelLevel;
    }

    public void setCurrentFuelLevel(double currentFuelLevel) {
        this.currentFuelLevel = currentFuelLevel;
    }

    @Override
    public String toString() {
        return "CurrentFuelLevel{" +
                "currentFuelLevel=" + currentFuelLevel +
                '}';
    }
}

class Type {
    //boolean commercial or not
    private boolean commercial;

 //   public Type(boolean commercial) {
 //       this.commercial = commercial;
 //   }

    public boolean isCommercial() {
        return commercial;
    }

    public void isCommercial(boolean commercial) {
        this.commercial = commercial;
    }

    @Override
    public String toString() {
        return "Type{" +
                "commercial=" + commercial +
                '}';
    }
}

class MaxSpeed {
    private double maxSpeed;

 //   public MaxSpeed(double maxSpeed){
 //       this.maxSpeed = maxSpeed;
 //   }

    public double getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(double maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    @Override
    public String toString() {
        return "MaxSpeed{" +
                "maxSpeed=" + maxSpeed +
                '}';
    }
}



