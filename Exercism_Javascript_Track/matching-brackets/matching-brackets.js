//
// This is only a SKELETON file for the 'Matching Brackets' exercise. It's been provided as a
// convenience to get you started writing code faster.
//

export const isPaired = (combinations) => {
  const brackets = {
    '[':']',
    '{':'}',
    '(':')',
  };

  let removedBrackets = [];

  for(let i = 0; i < combinations.length; i++){
    if(Object.keys(brackets).includes(combinations[i])){
      removedBrackets.push(combinations[i]);
    }else if(Object.values(brackets).includes(combinations[i])){
      removedBrackets.push(combinations[i]);
    }
  }
  let arrayLen = removedBrackets.length ;
  if((arrayLen % 2) != 0) {
    return false;
  }
  console.log(removedBrackets);
  for(let i = 0; i < arrayLen / 2; i++){
    let bracket = removedBrackets[i];
    let match = removedBrackets[(arrayLen-1)-i];
    //console.log(brackets[bracket] +'match is = '+ match);
    if(brackets[bracket] != match){
      //console.log('yes');
      if(brackets[bracket] == removedBrackets[i+1]){
        return true;
      }
		return false;
    }
  }

  return true;
};
