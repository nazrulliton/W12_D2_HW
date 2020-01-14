import attractions.*;
import org.junit.Before;
import org.junit.Test;
import stalls.*;

import static org.junit.Assert.assertEquals;

public class ThemeParkTest {

    ThemePark themePark;
    RollerCoaster rollerCoaster;
    TobaccoStall tobaccoStall;
    Dodgems dodgem;
    Playground playground;
    CandyflossStall candyflossStall;
    IceCreamStall iceCreamStall;
    Park park;



    @Before
    public void before(){
        themePark = new ThemePark();
       rollerCoaster = new RollerCoaster("Killer Mike", 5);
       dodgem = new Dodgems("Dirty D", 4);
       playground = new Playground("Big Playground", 4);
       park = new Park("Small Park", 5);
       tobaccoStall = new TobaccoStall("Marlboro", "Jeffery", ParkingSpot.A1, 5);
       candyflossStall = new CandyflossStall("CandyFloss", "John", ParkingSpot.A2, 5);
       iceCreamStall = new IceCreamStall("Ice Cream", "Davie", ParkingSpot.A3, 5);
       themePark.addItem(rollerCoaster);
       themePark.addItem(tobaccoStall);
       themePark.addItem(dodgem);
       themePark.addItem(playground);
       themePark.addItem(park);
       themePark.addItem(candyflossStall);
       themePark.addItem(iceCreamStall);
    }
    @Test
    public void canAddItem(){
        assertEquals(7, themePark.getItems().size());
    }




}
