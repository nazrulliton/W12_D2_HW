package attractions;

import people.Visitor;

public class RollerCoaster extends Attraction  {

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
}
