//
// This is only a SKELETON file for the 'ETL' exercise. It's been provided as a
// convenience to get you started writing code faster.
//

export const transform = (old) => {
  const newSystem = {};

  for(let i = 1; i < 11; i++){
    if(old.hasOwnProperty(i)){
      old[i].forEach((element) => {
        newSystem[element.toLowerCase()] = i;
      });
    }
  }
  return newSystem;

  //Alternate solution
  /*for(let i in old){
      old[i].forEach((element) => {
        newSystem[element.toLowerCase()] = Number(i);
      });
    
  }
  return newSystem;  */
};
