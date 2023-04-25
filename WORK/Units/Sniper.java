//СНАЙПЕР

package WORK.Units;

import java.util.ArrayList;

public class Sniper extends Shooter {
    public Sniper(ArrayList<Hero> team, String name, int x, int y) {

        super(x, y, 6,team, name, 10, new int [] {3,6}, 2, 10,1, 1);

    }

    @Override
    public String getInfo() {
        return String.format("%s  arrows: %d  accuracy: %d",
                super.getInfo(), this.arrows, this.accuracy);
    }


}
