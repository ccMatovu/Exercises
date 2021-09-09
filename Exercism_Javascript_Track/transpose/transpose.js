//
// This is only a SKELETON file for the 'Transpose' exercise. It's been provided as a
// convenience to get you started writing code faster.
//

export const transpose = (array) => {
  let transposed = [];
  let count = 0;
  for(let word of array){
    count++;
    let subArray = word.split('');
    for(let i = 0; i < subArray.length; i++){
      if(!transposed[i]){
        for(let j = 1; j <= count; j++){
          
        }
        transposed.push(subArray[i]);
      }else{
        transposed[i] += subArray[i];
      }
    }
  }
  // transposed.forEach((word,index,transposed) => {
  //   while(word.length < count){
  //     word = " "+word;
  //   }
  //   transposed[index] = word;
  // });
  return transposed;
};
