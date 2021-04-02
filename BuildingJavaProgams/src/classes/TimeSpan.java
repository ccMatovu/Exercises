package classes;

public class TimeSpan {
    private int hours;
    private int minutes;

    public void add(int hours, int minutes){
        int added = hours + minutes;
    }
    public int getHours(){
        return hours;
    }
    public int getMinutes(){
        return minutes;
    }
    public String toString(){
        return String.valueOf(hours);
    }
}
