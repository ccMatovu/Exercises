//
// This is only a SKELETON file for the 'Anagram' exercise. It's been provided as a
// convenience to get you started writing code faster.
//

export const findAnagrams = (word,candidates) => {
  let anagrams = [];
  for(let candidate of candidates){
    let check = candidate.split('').every((element)=>{
     console.log(element);
		console.log(word.includes(element));
		return word.toLowerCase().includes(element.toLowerCase());
      
    });
    if(check && (candidate.length == word.length)){
      console.log(candidate);
      anagrams.push(candidate);
    }
  }
  return anagrams;

};
