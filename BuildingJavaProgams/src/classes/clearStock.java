package classes;
/*
* Add the following mutator method to the Stock class from textbook section 8.5
* :
public void clear()
Resets this Stock's number of shares purchased and total cost to 0.*/

public class clearStock {
    private int totalShares;
    private int totalCost;

    public void clear(){
        this.totalShares = 0;
        this.totalCost =0;
    }
}
