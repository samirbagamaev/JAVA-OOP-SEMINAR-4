//СТРЕЛОК

package WORK.Units;

import java.util.ArrayList;

public abstract class Shooter extends Hero { /// СТРЕЛКИ --> --> --> --> -->
    protected int arrows;
    protected int maxArrows;
    protected int accuracy;
    protected int range;

    public Shooter(int x, int y, int init, ArrayList<Hero> team, String name, int health, int[] damage, int armor,
            int arrows, int accuracy, int range) {
        super(x, y, init, team, name, health, damage, armor);
        this.arrows = arrows;
        this.maxArrows = arrows;
        this.accuracy = accuracy;
        this.range = range;
    }

    @Override
    public void step(ArrayList<Hero> enemyTeam, ArrayList<Hero> friend) {
        if (health < 1 || arrows < 1)
            return;
        double min = Integer.MAX_VALUE;

        int index_closedEnemy = 0;
        for (int i = 0; i < enemyTeam.size(); i++) {
            double temp = this.coordinates.distanceSearch(enemyTeam.get(i).coordinates);
            if (temp < min) {
                index_closedEnemy = i;
                min = temp;
            }
        }
        attack(enemyTeam.get(index_closedEnemy));
        System.out.println("Выстрел");
        this.arrows--;
        for (Hero hero : this.team) {
            if (hero.toString().equals("Peasant")) {
                if (hero.health > 0) {
                    this.arrows++;
                    break;
                }
            }
        }

    }
}
