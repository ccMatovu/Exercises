package classes;
/*
* Add the following method to the TimeSpan class:

public void subtract(TimeSpan span)
Subtracts the given amount of time from this time span.
*  (You do not need to worry about the case of a negative result.)

Recall the TimeSpan code from this chapter:

    public void subtract(TimeSpan span){
        if(span.getMinutes() > minutes){
            minutes = (minutes + 60)- span.getMinutes();
            hours -= (1+ span.hours);
        }else {
            hours -= span.getHours();
            minutes -= span.getMinutes();
        }
    }
*/
