package labs_examples.objects_classes_methods.labs.objects;

public class PlaneNameandPersonel {
    public static void main(String[] args) {
        Type spiritCommercialType = new Type();
        PlaneName spiritPlaneName = new PlaneName();
        Staff spiritStaffNumber = new Staff();


        spiritCommercialType.isCommercial(true);
        spiritPlaneName.setAirlinePlane("Boeing 777 jet");
        spiritStaffNumber.setGroupNumber(72);

        System.out.println("The " + spiritPlaneName.getAirlinePlane() +
                " flying to Seattle will be flying with crew number " +
                    spiritStaffNumber.getGroupNumber() + ".");

    }
}

class PlaneName{
    private String airlinePlane;

    public String getAirlinePlane() {
        return airlinePlane;
    }
    public void setAirlinePlane(String airlinePlane) {
        this.airlinePlane = airlinePlane;
    }
}

class Staff{
    private int groupNumber;

    public int getGroupNumber() {
        return groupNumber;
    }
    public void setGroupNumber(int groupNumber) {
        this.groupNumber = groupNumber;
    }
}
