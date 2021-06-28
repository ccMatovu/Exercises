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
    let totalMinutes = (this.hours * 60) + (this.minutes);
    let totalHours = totalMinutes/60;
    let timeHours = Math.floor(totalHours % 24);
    let timeMinutes = totalMinutes % 60;

    let realHours = (timeHours < 10) ? '0'+timeHours  : ''+timeHours;
    let realMinutes = (timeMinutes < 10) ? '0'+timeMinutes : '0'+timeMinutes;

    

    return `${realHours}:${realMinutes}`;

    
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

const p =new Clock(8);
console.log('check');
console.log(p.toString());
console.log('0'+'0');


