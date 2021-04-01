package classes;
/*
* Add the following method to the Point class:

public double slope(Point other)

Returns the slope of the line drawn between this Point and the given other Point.
*  Use the formula (y2 - y1) / (x2 - x1) to determine the slope between two
* points (x1, y1) and (x2, y2). Note that this formula fails for points with
* identical x-coordinates, so throw an IllegalArgumentException in this case.*/

public class slopePoint extends Point {

    slopePoint(int x, int y){
        super(x,y);
    }

    public static void main(String[] args) {

    }
}
