package classes;
/*
* Add the following method to the Point class:

public int manhattanDistance(Point other)

Returns the "Manhattan distance" between the current Point object and the given
* other Point object. The Manhattan distance refers to how far apart two places
* are if the person can only travel straight horizontally or vertically, as
* though driving on the streets of Manhattan. In our case, the Manhattan
* distance is the sum of the absolute values of the differences in their
* coordinates; in other words, the difference in x plus the difference in y
* between the points.*/

public class manhattanDistancePoint extends flipPoint {
    manhattanDistancePoint(int x, int y) {
        super(x, y);
    }

    public static void main(String[] args) {

        manhattanDistancePoint point = new manhattanDistancePoint(4,-6);
        manhattanDistancePoint other = new manhattanDistancePoint(2,3);
        int distance = point.manhattanDistance(other);
        System.out.println(distance);
    }

    public  int manhattanDistance(Point other){

        return Math.abs(this.x-other.x)+Math.abs(this.y-other.y);
    }
}
