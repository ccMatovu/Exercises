//
// This is only a SKELETON file for the 'Scrabble Score' exercise. It's been provided as a
// convenience to get you started writing code faster.
//

export const score = (letters) => {
  const values = {
    1: ['a','e','i','o','u','l','n','r','s','t'],
    2: ['d','g',],
    3: ['b','c','m','p'],
    4: ['f','h','v','w','y'],
    5: ['k'],
    8: ['j','x'],
    10: ['q','z']
  };
  let array = letters.toLowerCase().split('');
  return array.reduce((accumulator,element) =>{
    for(let key in values){
      for(let value of values[key]){
        if(values[key].includes(element)){
          return accumulator + Number(key);
        }
      }
    }
  },0);
}
