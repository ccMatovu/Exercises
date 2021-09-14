//
// This is only a SKELETON file for the 'Transpose' exercise. It's been provided as a
// convenience to get you started writing code faster.
//

export const transpose = (array) => {
  let index = 0;
  let na = [];
  let len = array.reduce((accu,item) =>{
    return (accu < item.length) ? item.length:accu;  
  },0);

	//console.log(len);
  for(let i = 0; i < len; i++){
    let tran = '';
	  let item='';
   // let longer = (array[0].length > array[1].length)?true:false;

    for(let j=0;j<array.length;j++ ){
		 item = array[j];
		//console.log(item);
      if(item[0]){
      tran += item.slice(0,1);
      array[j] = item.slice(1);
		  index = j;
		  //console.log(item +'  '+ tran);
      }
	  else {
        tran += ' ';
      }
		
    }
	        na.push(tran);

  }
return na;
























  // let transposed = [];
  // let count = 0;
  // for(let word of array){
  //   count++;
  //   let subArray = word.split('');
  //   for(let i = 0; i < subArray.length; i++){
  //     if(!transposed[i]){
  //       for(let j = 1; j <= count; j++){
          
  //       }
  //       transposed.push(subArray[i]);
  //     }else{
  //       transposed[i] += subArray[i];
  //     }
  //   }
  // }
  // transposed.forEach((word,index,transposed) => {
  //   while(word.length < count){
  //     word = " "+word;
  //   }
  //   transposed[index] = word;
  // });
  // return transposed;
};
