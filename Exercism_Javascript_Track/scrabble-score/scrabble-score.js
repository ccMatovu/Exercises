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
    6: ['j','x'],
    7: ['q','z']
  };
  let array = letters.split('');
  let points = array.reduce((accu,element) =>{
    for(let key in values){
      let arrayValues = values[key];
      for(let value of arrayValues){
        if(arrayValues.includes(element)){
          return accu + Number(key);
        }
      }
    }
  },0);
  return points;
};
