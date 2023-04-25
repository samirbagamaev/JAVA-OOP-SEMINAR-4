//КОЛДУН

package WORK.Units;

import java.util.ArrayList;

public class Witcher extends Magian {
    public Witcher(ArrayList<Hero> team,String name, int x, int y) {

        super(x, y,5,team,name, 10, new int [] {1,5}, 3, 9,1,7);
    }

    @Override
    public String getInfo() {
        return String.format("%s  mana: %d  accuracy: %d",
                super.getInfo(), this.mana, this.accuracy);
    }

}