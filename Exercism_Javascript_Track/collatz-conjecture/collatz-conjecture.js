//
// This is only a SKELETON file for the 'Collatz Conjecture' exercise. It's been provided as a
// convenience to get you started writing code faster.
//

export const steps = (number) => {
   if(number < 1){
    throw 'Only positive numbers are allowed';
  }
  else{
    return collatz(number,0);
  }  
};

function collatz(number,stepsCount){
  if(number == 1){
    return stepsCount;
  }
  else if( (number % 2 ) == 0){
   return collatz(number / 2, stepsCount + 1);
  }
  else{
    return collatz((3 * number) +1, stepsCount + 1);
  }
}

