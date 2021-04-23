public class GroceryBill {
    private Employee clerk;
    private List<Item> receipt;
    private double total;
    private double internalDiscount;

    public GroceryBill(Employee clerk) {
        this.clerk = clerk;
        receipt = new ArrayList<Item>();
        total = 0.0;
        internalDiscount = 0.0;
    }

    public void add(Item i) {
        receipt.add(i);
        total += i.getPrice();
        internalDiscount += i.getDiscount();
    }

    public double getTotal() {
        return Math.rint(total * 100) / 100.0;
    }

    public Employee getClerk() {
        return clerk;
    }

    public void printReceipt() {
        System.out.println(this);
    }
}