import attractions.Attraction;
import behaviours.IReviewed;
import people.Visitor;

import java.util.ArrayList;

public class ThemePark {
    private ArrayList<IReviewed> items;
    private Visitor visitor;
    private Attraction attraction;


    public ThemePark(){
        this.items = new ArrayList<>();

    }
    public void addItem(IReviewed item){
        this.items.add(item);
    }

    public ArrayList<IReviewed> getAllReviewed() {
        return items;
    }
    public void visit(Visitor visitor, Attraction attraction){
        attraction.incrementVisitCount(1);
        visitor.addItem(attraction);
    }
}
