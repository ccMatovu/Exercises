package InheritanceAndInterfaces;

public class FilteredAccount {
    private int zeroTrans;
    private int totalTrans;

    public FilteredAccount (Client c) {
        super(c);
        zeroTrans = 0;
        totalTrans = 0;
    }

    public boolean process(Transaction t) {
        totalTrans++;
        if (t.value() == 0) {
            zeroTrans++;
            return true;
        } else {
            return super.process(t);
        }
    }
}
