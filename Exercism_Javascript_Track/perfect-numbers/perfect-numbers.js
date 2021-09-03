//
// This is only a SKELETON file for the 'Perfect Numbers' exercise. It's been provided as a
// convenience to get you started writing code faster.
//

export const classify = (number) => {
 if(number < 1){
    throw new Error('Classification is only possible for natural numbers.');
  }
  let factors = [];

  for(let i = 1; i <= (number/2)+1; i++){
    if(number % i ==0){	
      factors.push(i);
    }
  }

  let aliquotSum = factors.reduce((sum,factor)=>sum + factor);
  if((aliquotSum < number) || (number < 3)){
    return 'deficient';
  }else if(aliquotSum > number){
    return 'abundant';
  }else{
    return 'perfect';
  }
};
