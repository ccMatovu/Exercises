package classes;

public class TimeSpan {
    private int hours;
    private int minutes;

    public void add(int hours, int minutes){
        this.hours += hours;
        this.minutes +=minutes;
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

    public void add(TimeSpan span){
        hours += span.getHours();
        minutes += span.getMinutes();

        if(minutes >= 60){
            minutes = minutes-60;
            hours += 1;
        }
    }
}
