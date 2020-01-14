import behaviours.IReviewed;

import java.util.ArrayList;

public class ThemePark {
    private ArrayList<IReviewed> items;


    public ThemePark(){
        this.items = new ArrayList<>();

    }
    public void addItem(IReviewed item){
        this.items.add(item);
    }

    public ArrayList<IReviewed> getAllReviewed() {
        return items;
    }
}
