package classes;
/*Add the following method to the TimeSpan class:

public void scale(int factor)
Scales this time span by the given factor. For example, 1 hour and 45 minutes
 scaled by 2 equals 3 hours and 30 minutes.
Recall the TimeSpan code from this chapter:
public class scaleTimeSpan {

    public void scale(int factor){
        int min = this.minutes*factor;
        this.hours= this.hours*factor;

        while(min>=60){
            min = min-60;
            this.hours+=1;
        }
        this.minutes = min;
    }

}
*/