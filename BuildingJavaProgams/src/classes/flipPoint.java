package classes;
/*
* Add the following method to the Point class:

public void flip()

Negates and swaps the x/y coordinates of the Point object. For example,
* if the object initially represents the point (5, -3), after a call to flip,
*  the object should represent (3, -5). If the object initially represents the
* point (4, 17), after a call to flip, the object should represent (-17, -4).*/
public class flipPoint extends Point {
    flipPoint(int x, int y) {
        super(x, y);
    }

    public static void main(String[] args) {
       


    }

    public void flip(){
        int tempPoint = this.x;
        this.x =-this.y;
        this.y=-tempPoint;
    }
}

