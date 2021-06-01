//
// This is only a SKELETON file for the 'Resistor Color Duo' exercise. It's been provided as a
// convenience to get you started writing code faster.
//

export const decodedValue = (colors) => {

  const colorArray = ["black","brown","red","orange","yellow","green","blue","violet","grey","white"];

  let positon1 = colorArray.indexOf(colors[0]);

  let position2 = colorArray.indexOf(colors[1]);

  let value = positon1.toString()+position2;
  
  return parseInt(value);
};
