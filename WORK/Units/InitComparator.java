package WORK.Units;

import java.util.Comparator;

public class InitComparator implements Comparator<Hero> {
    @Override
    public int compare(Hero o1, Hero o2) {
        return Integer.compare(o2.initiative, o1.initiative);
    }
}
