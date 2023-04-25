package WORK.Units;

import java.util.ArrayList;

public interface GameInterface {
    void step(ArrayList<Hero> enemy, ArrayList<Hero> friend);

    String getInfo();
}