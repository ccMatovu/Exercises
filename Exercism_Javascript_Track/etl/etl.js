//
// This is only a SKELETON file for the 'ETL' exercise. It's been provided as a
// convenience to get you started writing code faster.
//

export const transform = (old) => {
  const newScores = {};
  
  // console.log(old[1]);
  // console.log(old.hasOwnProperty(5));
  // console.log(Object.keys(old).length);

  for(let i = 1; i < 11; i++){
    //console.log(i);
    if(old.hasOwnProperty(i)){
      let array = old[i];
      array.forEach((element) => {
        //console.log('the ele is = '+element);
        newScores[element.toLowerCase()] = i;
      });
    }
  }
  console.log(newScores);
};
