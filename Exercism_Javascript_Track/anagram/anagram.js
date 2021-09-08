//
// This is only a SKELETON file for the 'Anagram' exercise. It's been provided as a
// convenience to get you started writing code faster.
//

export const findAnagrams = (checkWord,candidates) => {
  let anagrams = [];
  for(let candidate of candidates){
    let word = checkWord.toLowerCase();
    let check = candidate.toLowerCase().split('').every((element) => {
    if(word.includes(element) && (checkWord.toLowerCase() != candidate.toLowerCase())){
      let index = word.indexOf(element);
      word = word.slice(0,index) + word.slice(index+1);
      return true;
    }else{
      return false;
    }      
    });
    if(check && (candidate.length == checkWord.length)){
      anagrams.push(candidate);
    }
  }
  return anagrams;

};
