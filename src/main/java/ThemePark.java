import behaviours.IReviewed;

import java.util.ArrayList;

public class ThemePark {
    private ArrayList<IReviewed> items;

    public ThemePark(){
        this.items = new ArrayList<IReviewed>();
    }
    public int itemCount(){
     return items.size();
    }

}
