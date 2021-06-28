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

    let realHours ;//= (totalHours < 0) ? totalHours.toString()  : ''+totalHours;

    if(totalHours<0){
      realHours =  
    }

    return `${realHours}:${timeMinutes}`;

    
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

const p =new Clock(0,160);
console.log('check');
console.log(p.toString());

let foo = 45;
let bar = ''+foo;
console.log(bar);
