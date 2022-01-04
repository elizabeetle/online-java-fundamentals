package labs_examples.objects_classes_methods.labs.objects;

public class Example_01 {

    public static void main(String[] args) {

        Airplane myAirplane = new Airplane(true, 254, 754, 354);

        System.out.println(myAirplane.toString());

    }


}

class Airplane {
    boolean type;
    double maxSpeed;
    double fuelCapacity;
    double currentFuelLevel;

    public Airplane(boolean type, double maxSpeed, double fuelCapacity, double currentFuelLevel) {
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
    double fuelCapacity;

    public FuelCapacity(double fuelCapacity) {
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
    double currentFuelLevel;

    public CurrentFuelLevel(double currentFuelLevel) {
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
    boolean commercial;

    public Type(boolean commercial) {
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
    double maxSpeed;

    public MaxSpeed(double maxSpeed){
        this.maxSpeed = maxSpeed;
    }

    @Override
    public String toString() {
        return "MaxSpeed{" +
                "maxSpeed=" + maxSpeed +
                '}';
    }
}