package classes;
/*
* Add the following method to the Point class:

public boolean isCollinear(Point p1, Point p2)
*
Returns whether this Point is collinear with the given two other points.
*  Points are collinear if a straight line can be drawn that connects them.
*  Two basic examples are three points that have the same x- or y-coordinate.
* The more general case can be determined by calculating the slope of the line
* between each pair of points and checking whether this slope is the same for
* all pairs of points. Use the formula (y2 - y1) / (x2 - x1) to determine the
* slope between two points (x1, y1) and (x2, y2). (Note that this formula fails
* for points with identical x-coordinates so this will have to be special-cased
* in your code.)

Since Java's double type is imprecise, round all slope values to a reasonable
*  accuracy such as four digits past the decimal point before you compare them.*/

public class isCollinearPoint {
    int x;
    int y;
    public static void main(String[] args) {
        Point pont1 = new Point(99,8);
        Point pont2 = new Point(0,5);

        isCollinearPoint point = new isCollinearPoint(2,15);
        System.out.println(point.isCollinear(pont1,pont2));


    }

    private boolean isCollinear(Point pont1, Point pont2) {
        if ((this.x == pont1.x && this.x == pont2.x) || (this.y == pont1.y && this.y == pont2.y)) {
            return true;
        }
        boolean check = false;
        double slope1 = (pont1.y -pont2.y)/(pont1.x - pont2.x);
        System.out.println(slope1);
        double slope2 = (pont2.y - y)/(pont2.x - x);
        System.out.println(slope2);

        if(slope1 == slope2){
            check = true;
        }
     return check;
    }

    isCollinearPoint(int x, int y){
        this.x = x;
        this.y = y;
    }
}
