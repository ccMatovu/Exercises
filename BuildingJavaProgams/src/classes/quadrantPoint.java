package classes;

/*
* Add the following method to the Point class:

public int quadrant()

Returns which quadrant of the x/y plane this Point object falls in.
* Quadrant 1 contains all points whose x and y values are both positive.
* Quadrant 2 contains all points with negative x but positive y.
* Quadrant 3 contains all points with negative x and y values.
* Quadrant 4 contains all points with positive x but negative y.
* If the point lies directly on the x and/or y axis, return 0.*/

public class quadrantPoint {
    public static void main(String[] args) {
        Point point = new Point(2,3);
        System.out.println("This point is in quadrant number "+point.quadrant());

    }

}
 class Point {
    private int x;
    private int y;
    Point(int x, int y){
        this.x=x;
        this.y=y;
    }

    public int quadrant() {
        int quad = 1;

        if (this.x == 0 || this.y == 0) {
            quad = 0;
        } else if (this.x > 0 && this.y > 0) {
            quad = 1;
        } else if (this.x < 0 && this.y > 0) {
            quad = 2;
        } else if (this.x < 0 && this.y < 0) {
            quad = 3;
        } else if (this.x > 0 && this.y < 0) {
            quad = 4;
        } else {
            quad = 0;
        }
        return quad;
    }
}
