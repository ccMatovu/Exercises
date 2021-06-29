//
// This is only a SKELETON file for the 'Clock' exercise. It's been provided as a
// convenience to get you started writing code faster.
//

export class Clock {
  //let minutes = 0;
 // let hours = 0;

  constructor(hours = 0,minutes = 0) {
    this.hours = hours;
    this.minutes = minutes;

  }

  toString() {
    let mins = this.minutes;
    let hrs = this.hours;

    if(mins < -60){
      console.log('befro= '+hrs);

      hrs = hrs - Math.floor(Math.abs((mins/60)));
      console.log('afer= '+hrs);
     // mins = mins + (60*Math.abs(mins));
     mins = mins + Math.floor(Math.abs((mins/60)))*60;
      console.log('mins beffff= '+mins);
    }

    if((mins < 0) && (mins >= -60)){
      mins = mins+60;
      console.log('newmin= '+mins);
      hrs = hrs -1;
    } 

    hrs = hrs + (mins / 60);
    hrs = (hrs < 0) ? 24 - Math.abs(hrs % 24) : hrs;

    hrs = Math.floor(hrs%24);
    mins = Math.abs(mins) % 60;

    let clockHours = (hrs < 10) ? '0' + hrs : '' + hrs;
    let clockMinutes = (mins < 10) ? '0' + mins : ''+ mins;

    return `${clockHours}:${clockMinutes}`;

    

    //let hrs = (this.hours < 0) ? 24-()
    // let totalMinutes = (Math.abs(this.hours) * 60) + (this.minutes);
    // let totalHours = totalMinutes/60;
    // let timeHours = (this.hours >= 0) ? Math.floor(totalHours % 24) : (Math.floor(totalHours % 24)) - 24;
    // let timeMinutes = totalMinutes % 60;

    // let realHours = (timeHours < 10) ? '0'+timeHours  : ''+timeHours;
    // let realMinutes = (timeMinutes < 10) ? '0'+timeMinutes : ''+timeMinutes;

  
    
  }

  // plus() {
  //   throw new Error('Remove this statement and implement this function');
  // }

  // minus() {
  //   throw new Error('Remove this statement and implement this function');
  // }

  // equals() {
  //   throw new Error('Remove this statement and implement this function');
  // }
}

const p =new Clock(-121,-5810);
console.log('check');
console.log(p.toString());
console.log('0'+'0');


