package WORK.Units;


import java.util.ArrayList;

public class Coordinates {
    int x, y;


    public Coordinates(int x, int y) {
        this.x = x;
        this.y = y;

    }

    public double distanceSearch(Coordinates coord){
        double x =  this.x - coord.x;
        double y =  this.y - coord.y;
        double distance = Math.sqrt(Math.pow(x,2)+Math.pow(y,2));
        return distance;

    }
}
