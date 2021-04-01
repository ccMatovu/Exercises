package classes;
/*
* Add the following method to your Point class:

public boolean isVertical(Point other)

Returns true if the given Point lines up vertically with this Point; that is,
*  if their x coordinates are the same.*/

public class isVerticalPoint extends Point{

    isVerticalPoint(int x, int y) {
        super(x, y);
    }

    public static void main(String[] args) {
        isVerticalPoint point = new isVerticalPoint(2,4);
        Point other = new Point(2,4);
        System.out.println(point.isVertical(other));

    }

    public boolean isVertical(Point other){
        if(other.x == this.x){
            return true;
        }else{
            return false;
        }
    }
}
