package people;

import attractions.Dodgems;
import org.junit.Before;
import org.junit.Test;
import org.omg.CORBA.PUBLIC_MEMBER;

import static org.junit.Assert.assertEquals;

public class VisitorTest {

    Visitor visitor;
    Dodgems dodgems;

    @Before
    public void before()
    {
        visitor = new Visitor(14, 1.2, 40.0);
        dodgems = new Dodgems("Dogems", 5);
    }

    @Test
    public void hasAge() {
        assertEquals(14, visitor.getAge());
    }

    @Test
    public void hasHeight() {
        assertEquals(1.2, visitor.getHeight(), 0.1);
    }

    @Test
    public void hasMoney() {
        assertEquals(40.0, visitor.getMoney(), 0.1);
    }

    @Test
    public void vistedAttractiosStartsEmpty(){
        assertEquals(0, visitor.getVisitedAttractions().size());
    }
    @Test
    public void  CanAddItem(){
            visitor.addItem(dodgems);
        assertEquals(1, visitor.getVisitedAttractions().size());

    }
}
