//
// This is only a SKELETON file for the 'Isogram' exercise. It's been provided as a
// convenience to get you started writing code faster.
//

export const isIsogram = (word) => {
  let chars = word.split('');
  chars = chars.filter(char => char.toUpperCase() != char.toLowerCase());
  for(let j = chars.length-1; j >=0; j--){
    for(let i = j-1; i >= 0; i--){
      if(chars[j].toLowerCase() == chars[i].toLowerCase()){
        return false;
      }
    }
  }
  return true;
};
