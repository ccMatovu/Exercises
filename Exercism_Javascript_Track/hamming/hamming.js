//
// This is only a SKELETON file for the 'Hamming' exercise. It's been provided as a
// convenience to get you started writing code faster.
//

export const compute = (dna1,dna2) => {
  if( (dna1 == '') && (dna2 == '') ){
    return 0;
  }
  else if(dna1 == ''){
    throw new Error('left strand must not be empty');
  }
  else if(dna2 == ''){
    throw new Error('right strand must not be empty');
  }
  else if(dna1.length != dna2.length ){
     throw new Error('left and right strands must be of equal length');
  }
  let dnaArray1 = dna1.split('');
  let dnaArray2 = dna2.split('');

  return dnaArray1.reduce((hamming,letter,index,) => {
    (dnaArray2[index] != letter) ? hamming++ : hamming;
    return hamming;
  },0);
};
