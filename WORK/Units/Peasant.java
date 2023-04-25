//КРЕСТЬЯНИН

package WORK.Units;

import java.util.ArrayList;

public class Peasant extends Hero{
    public Peasant (ArrayList<Hero> team, String name, int x, int y){

        super(x, y, 1, team, name, 10, new int [] {1,2}, 1);
    }

    @Override
    public String getInfo() {

        return super.getInfo();

    }

}
