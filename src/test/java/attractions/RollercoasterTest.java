package attractions;

import org.junit.Before;
import org.junit.Test;
import people.Visitor;

import static org.junit.Assert.*;

public class RollercoasterTest {

    RollerCoaster rollerCoaster;
    Visitor visitor;

    @Before
    public void setUp() {
        rollerCoaster = new RollerCoaster("Blue Ridge", 10);
    }

    @Test
    public void hasName() {
        assertEquals("Blue Ridge", rollerCoaster.getName());
    }

    @Test
    public void hasRating() {
        assertEquals(10, rollerCoaster.getRating());
    }

    @Test
    public void hasVisitCount() {
        assertEquals(0, rollerCoaster.getVisitCount());
    }

    @Test
    public void checkIsAllowedto(){
        visitor = new Visitor(18, 150, 5);
        assertTrue(rollerCoaster.isAllowedTo(visitor));
    }
    @Test
    public void checkIsNotAllowedto(){
        visitor = new Visitor(11, 150, 5);
        assertFalse(rollerCoaster.isAllowedTo(visitor));
    }
    @Test
    public void canGetPriceForVisitor(){
        visitor = new Visitor(11, 150, 5);
        assertEquals(8.4, rollerCoaster.priceFor(visitor),0.01);
    }

}
