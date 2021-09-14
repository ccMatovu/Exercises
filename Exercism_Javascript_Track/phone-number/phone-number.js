//
// This is only a SKELETON file for the 'Phone Number' exercise. It's been provided as a
// convenience to get you started writing code faster.
//

export const clean = (number) => {
  const punctuations = [ ",", ":", "!", "?"];
  
  let num = '';
  for(let i = 0; i < number.length; i++){
    if((!isNaN(number[i])) && number[i] != ' '){
      num += number[i];
    }
    else if(number[i].toUpperCase() != number[i].toLowerCase()){
      throw new Error('Letters not permitted');
    }
    else if((number.length > 11)&&(punctuations.includes(number[i]))){
      throw new Error('Punctuations not permitted');
    }
  }


  if(num.length < 10){
    throw new Error('Incorrect number of digits');
  }
  else if(num.length == 11){
    if(num[0] != '1'){
      throw new Error('11 digits must start with 1');
    }else{
      num = num.slice(1);
    }

    if(num[0] == '0'){
      throw new Error('Area code cannot start with zero');
    }else if(num[0] == '1'){
      throw new Error('Area code cannot start with one');
    }else if(num[3] == '0'){
      throw  new Error('Exchange code cannot start with zero');
    }
  }
  else if(num.length > 11){
    throw new Error('More than 11 digits');
  }
  else if(num[0] == '0'){
    throw new Error('Area code cannot start with zero');
  }
  else if(num[0] == '1'){
    throw new Error('Area code cannot start with one');
  }
  else if(num[3] == '0'){
    throw new Error('Exchange code cannot start with zero');
  }
  else if(num[3] == '1'){
    throw new Error('Exchange code cannot start with one');
  }
  return num;
};
