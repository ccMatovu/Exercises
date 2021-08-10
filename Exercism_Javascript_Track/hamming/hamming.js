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
    console.log("checked");
     throw new Error('left and right strands must be of equal length');
  }
  let dnaArray1 = dna1.split('');
 // console.log(dna1);
  let dnaArray2 = dna2.split('');
  let hamming2 = dnaArray1.reduce((hamming,letter1,index,) => {
   // console.log(length + " = " + index+ " letter = "+ letter1);
    (dnaArray2[index] != letter1) ? hamming++ : hamming +=0;
    console.log(dnaArray2[index]);
    console.log(hamming + " = " + index+ " letter = "+ letter1);
    return hamming;

  },0);

  return hamming2;
};
