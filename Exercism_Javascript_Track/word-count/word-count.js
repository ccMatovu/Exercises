//
// This is only a SKELETON file for the 'Word Count' exercise. It's been provided as a
// convenience to get you started writing code faster.
//

export const countWords = (stri) => {
  let st = stri.replace(/\r?\n|\r|,/g,' ');
let sta = st.split(' ');
//console.log(sta);
let narray = [];
for(let i=0;i<sta.length;i++){
	let word =sta[i];
	let char = word.charAt(0);
	while((char.toUpperCase() == char.toLowerCase()) &&(isNaN(char))){
		
		word = word.slice(1);
		char = word.charAt(0);		
	}
	char = word.charAt(word.length-1);
	while((char.toUpperCase() == char.toLowerCase()) &&(isNaN(char))){
      word = word.slice(0,-1);
	char = word.charAt(word.length-1);		
	}	
  if(word){
	narray.push(word.toLowerCase());		
  }
}
console.log(narray)


let count = narray.reduce(function(counted,word){
	if(word in counted){
		 counted[word]++;
	}else{
		 counted[word] =1;
	}
	return counted
},{});

return count;
};
