
  //
// This is only a SKELETON file for the 'Clock' exercise. It's been provided as a
// convenience to get you started writing code faster.
//

export class Clock {
  constructor(hours = 0,minutes = 0) {
    this.hours = hours;
    this.minutes = minutes;
  }
}

  Clock.prototype.toString = function() {
    let mins = this.minutes;
    let hrs = this.hours;

    if(mins < -60){
      hrs = hrs - Math.floor(Math.abs((mins/60)));
      mins = mins + Math.floor(Math.abs((mins/60)))*60;
    }

    if((mins < 0) && (mins >= -60)){
      mins = mins+60;
      hrs = hrs -1;
    } 

    hrs = hrs + (mins / 60);
    hrs = (hrs < 0) ? 24 - Math.abs(hrs % 24) : hrs;

    hrs = Math.floor(hrs%24);
    mins = Math.abs(mins) % 60;

    let clockHours = (hrs < 10) ? '0' + hrs : '' + hrs;
    let clockMinutes = (mins < 10) ? '0' + mins : ''+ mins;

    return `${clockHours}:${clockMinutes}`;   
  };


  Clock.prototype.plus = function(addMins){
    const newClock = new Clock(this.hours,this.minutes + addMins);
    return newClock.toString();
  };


  Clock.prototype.minus = function(subractMins){
    const newClock = new Clock(this.hours,this.minutes - subractMins);
    return newClock.toString();
  }; 


  Clock.prototype.equals = function(otherClock){
    return this.toString() === otherClock.toString();
  };



