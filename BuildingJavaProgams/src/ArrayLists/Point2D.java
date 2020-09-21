package ArrayLists;/*
Suppose that a class Point2D has been defined for storing a 2-dimensional point
with x and y coordinates (both as doubles).
The class includes the following members:
 private double x:  the x coordinate
 private double y:	the y coordinate
 Point2D():	constructs the point (0, 0)
 Point2D(double x, double y):	constructs a point with the given coordinates
 void setLocation(double x, double y):	sets the coordinates to the given values
 double getX():	returns the x coordinate
 double getY():	returns the y coordinate
 String toString():	returns a String in standard "(x, y)" notation
 double distance(Point2D other):	returns the distance from another point
 Your task is to modify the class to be Comparable by adding an appropriate compareTo method.
 Points should be compared relative to their distance from the origin,
 with points closer to the origin considered "less" than points farther from it.
 The distance between two points is defined as the square root of the sum of the squares of
 the differences between the x and y coordinates.
 */




public class Point2D {
    public static void main(String[] args) {

    }
//    public int compareTo(Point2D o) {
//        Point2D origin = new Point2D(0, 0);
//        double newDist = distance(origin);
//        double originDist = o.distance(origin);
//        return Double.compare(newDist, originDist);
//    }
}
