//
// This is only a SKELETON file for the 'Acronym' exercise. It's been provided as a
// convenience to get you started writing code faster.
//


export const parse = (name) => {
  let acronym = name.split("-")
  .join(' ')
  .split('_')
  .join(' ')
  .split(' ')
  .filter(word=> word)
  .reduce((accumulator,word)=>{
    return accumulator +=word[0].toUpperCase();
  },'');

  return acronym;
};

