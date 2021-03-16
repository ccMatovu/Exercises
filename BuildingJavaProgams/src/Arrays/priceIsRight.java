package Arrays;
/*
* Write a method priceIsRight that accepts an array of integers bids
* and an integer price as parameters. The method returns the element
*  in the bids array that is closest in value to price without being
* larger than price. For example, if bids stores
* the elements {200, 300, 250, 999, 40}, then priceIsRight(bids, 280)
* should return 250, since 250 is the bid closest to 280 without
*  going over 280. If all bids are larger than price, then your
* method should return -1.*/

public class priceIsRight {
    public static void main(String[] args) {
        int[] elements = {200, 300, 250, 999, 40};
        System.out.println(priceIsRight(elements, 280));
    }

}
