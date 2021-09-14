//
// This is only a SKELETON file for the 'Phone Number' exercise. It's been provided as a
// convenience to get you started writing code faster.
//

export const clean = (number) => {
  const punctuations = [ ",", ":", "!", "?"]; 
  let cleanNumber = '';

  for(let i = 0; i < number.length; i++){
    if((!isNaN(number[i])) && number[i] != ' '){
      cleanNumber += number[i];
    }
    else if(number[i].toUpperCase() != number[i].toLowerCase()){
      throw new Error('Letters not permitted');
    }
    else if((number.length > 11)&&(punctuations.includes(number[i]))){
      throw new Error('Punctuations not permitted');
    }
  }


  if(cleanNumber.length < 10)    throw new Error('Incorrect number of digits');
  
  else if(cleanNumber.length == 11){
    if(cleanNumber[0] != '1')throw new Error('11 digits must start with 1');
    else  cleanNumber = cleanNumber.slice(1);
    

    if(cleanNumber[0] == '0') throw new Error('Area code cannot start with zero');
    else if(cleanNumber[0] == '1') throw new Error('Area code cannot start with one');
    else if(cleanNumber[3] == '0') throw  new Error('Exchange code cannot start with zero');
    else if(cleanNumber[3] == '1') throw  new Error('Exchange code cannot start with one');   
  }
  
  else if(cleanNumber.length > 11) throw new Error('More than 11 digits');

  else if(cleanNumber[0] == '0') throw new Error('Area code cannot start with zero');
  
  else if(cleanNumber[0] == '1') throw new Error('Area code cannot start with one');
  
  else if(cleanNumber[3] == '0')  throw new Error('Exchange code cannot start with zero');
  
  else if(cleanNumber[3] == '1')   throw new Error('Exchange code cannot start with one');
  
  return cleanNumber;
};
