package WORK.Units;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public abstract class Hero implements GameInterface, Comparable<Hero> {

    protected int initiative;
    protected String name; // имя
    protected int health; // здоровье
    protected int maxHealth; // Макс здоровье
    protected int[] damage; // урон
    protected int armor; // броня
    protected static Random rnd;

    protected ArrayList<Hero> team;
    protected Coordinates coordinates;
    protected String state;

    static {
        Hero.rnd = new Random();
    }

    protected Hero(int x, int y, int initiative, ArrayList<Hero> team, String name, int health, int[] damage,
            int armor) {
        this.coordinates = new Coordinates(x, y);
        this.initiative = initiative;
        this.team = team;
        this.name = name;
        this.health = health;
        this.maxHealth = health;
        this.damage = damage;
        this.armor = armor;
    }

    public String getInfo() {
        return String.format("Name: %s  Health: %d  Type: %s Damage: %s Armor %d Init %d",
                this.name, this.health, this.getClass().getSimpleName(),
                Arrays.toString(this.damage), this.armor, this.initiative);

    }

    protected void healed(int Hp) {
        this.health = Hp + this.health > this.maxHealth ? this.maxHealth : Hp + this.health;
    }

    protected void getDamage(int doneDamage) {
        // doneDamage = (int) (doneDamage * ((100 - this.armor) / 100));
        doneDamage =  doneDamage-armor;
        if ((this.health - doneDamage) > 0) {
            this.health -= doneDamage;
        } // тут будет метод умирания, если полученный урон > текущего здоровья
    }

    public void attack(Hero target) {
        target.getDamage(new Random().nextInt(this.damage[0], this.damage[1]+1));     // предположим пока, что в int[] damage только 2 числа
    }

    @Override
    public void step(ArrayList<Hero> enemy, ArrayList<Hero> friend) {

    }

    @Override
    public String toString() {
        return this.getClass().getSimpleName();
    }

    @Override
    public int compareTo(Hero o) {
        return o.initiative-this.initiative;
    }
}
