//КОПЕЙЩИК

package WORK.Units;

import java.util.ArrayList;

public class Spearman extends Infantry {  
    public Spearman (ArrayList<Hero> team,String name, int x, int y){

        super(x,y, 7,team, name, 10, new int [] {1,3}, 2, 2);
    }

    @Override
    public String getInfo() {
        return String.format("%s  tool: %d", super.getInfo(), this.tool);
    }


}
