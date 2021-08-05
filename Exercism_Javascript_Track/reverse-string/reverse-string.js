//
// This is only a SKELETON file for the 'Reverse String' exercise. It's been provided as a
// convenience to get you started writing code faster.
//

export const reverseString = function(word) {
  let characterArray = [...word];  
  let reversed ='';
  for(let i=characterArray.length; i > 0; i--){
    reversed +=characterArray[i];
  }
  return reversed;
};

