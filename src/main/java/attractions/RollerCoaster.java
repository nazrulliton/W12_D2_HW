package attractions;

import behaviours.ISecurity;
import behaviours.ITicketed;
import people.Visitor;

public class RollerCoaster extends Attraction implements ITicketed {

    public RollerCoaster(String name, int rating) {
        super(name, rating);
    }

    public boolean isAllowedTo(Visitor visitor) {
        if (visitor.getHeight() >= 145 && visitor.getAge() >= 12)
        {return true;}
        else{
            return false;
        }
    }


    public double defaultPrice(Visitor visitor) {
            return 16.8;

    }


    public double priceFor(Visitor visitor) {
        if (visitor.getHeight() > 200)
       {
           return 16.8;}
        else  {
            return 8.4;
        }
    }
}
