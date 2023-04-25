package WORK.Units;

import java.util.ArrayList;
import java.util.Random;

public abstract class Magian extends Hero { // герои с магическими способностями
    protected int mana;
    protected int maxMana;
    protected int accuracy;
    protected int range;

    protected Magian(int x, int y, int init, ArrayList<Hero> team, String name, int health, int[] damage, int armor, int mana, int accuracy, int range) {
        super(x, y, init, team, name, health, damage, armor);
        this.mana = mana;
        this.maxMana = mana;
        this.accuracy = accuracy;
        this.range = range;
    }
    protected void heal(Hero target){
        target.healed(new Random().nextInt(this.damage[0],this.damage[1]));
    }

    @Override
    public void step(ArrayList<Hero> enemy, ArrayList<Hero> friend) {
        int Hp = new Random().nextInt(this.damage[0],this.damage[1]+1);
        if(mana<1 || mana<Hp){
            System.out.println("Не достаточно маны");
            return;
        }
        int max_damaged =0;
        float min = friend.get(0).health / friend.get(0).maxHealth;
        for (int i = 0; i < team.size(); i++) {
                    if (friend.get(i).health / friend.get(i).maxHealth<min && team.get(i).health!=0) {
                        min = friend.get(i).health / friend.get(i).maxHealth;
                        max_damaged = i;
                    }
        }

        this.team.get(max_damaged).healed(Hp);
        this.mana -=Hp;

    }
}
