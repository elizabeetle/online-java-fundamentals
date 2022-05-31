package labs_examples.enumerations.labs;

import org.w3c.dom.ls.LSOutput;
import videos_source_code.oop.encapsulation.city.City;

public class EnumPractice {

    SimpleEmotions myEmote = SimpleEmotions.HAPPY;

    public static void main(String[] args) {
        System.out.println(CityLiving.CHICAGO.getTypeOfLivingSpace());
        System.out.println(CityLiving.NEW_YORK.getPrice());
        CityLiving.BALTIMORE.getBoth();
    }

}
