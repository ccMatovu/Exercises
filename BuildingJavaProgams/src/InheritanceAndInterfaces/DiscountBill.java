package InheritanceAndInterfaces;
/*
* Suppose a class GroceryBill keeps track of a list of items being purchased at a
*  market:
GroceryBill objects interact with Item objects. An Item has the following public
* methods:
For example, a candy bar item might cost 1.35 with a discount of 0.25 for preferred
* customers, meaning that preferred customers get it for 1.10. (Some items will have
* no discount, 0.0.) Currently the above classes do not consider discounts.
* Every item in a bill is charged full price, and item discounts are ignored.

Define a class DiscountBill that extends GroceryBill to compute discounts for
* preferred customers. The constructor for DiscountBill accepts a parameter for
*  whether the customer should get the discount.

Your class should adjust the amount reported by getTotal for preferred customers.
*  For example, if the total would have been $80 but a preferred customer is getting
* $20 in discounts, then getTotal should report the total as $60 for that customer.
*  You should also keep track of how many items a customer is getting a non-zero
* discount for and the overall discount, both as a total amount and as a percentage
*  of the original bill. Include the extra methods below that allow a client to ask
*  about the discount:

 */
public class DiscountBill extends GroceryBill {
    private boolean preferred;
    private int discountCount;
    private double discountAmount;

    public DiscountBill(Employee clerk, boolean preferred) {
        super(clerk);
        this.discountCount = 0;
        this.discountAmount = 0;
        this.preferred = preferred;
    }

    public double getTotal() {
        return super.getTotal() - discountAmount;
    }

    public void add(Item i) {
        super.add(i);

        if(preferred && i.getDiscount() > 0) {
            discountCount++;
            discountAmount += i.getDiscount();
        }
    }

    public int getDiscountCount() {
        return discountCount;
    }

    public double getDiscountAmount() {
        return discountAmount;
    }

    public double getDiscountPercent() {
        return (discountAmount * 100) / super.getTotal();
    }
}
