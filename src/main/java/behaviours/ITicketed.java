package behaviours;

import people.Visitor;

public interface ITicketed {
    public double defaultPrice(Visitor visitor);
    public double priceFor(Visitor visitor);
}
