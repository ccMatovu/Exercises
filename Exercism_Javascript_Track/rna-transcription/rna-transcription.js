//
// This is only a SKELETON file for the 'RNA Transcription' exercise. It's been provided as a
// convenience to get you started writing code faster.
//

export const toRna = (nucleotide) => {
    let Rna = '';

    for(let i =0; i<nucleotide.length; i++){

        if(nucleotide.charAt(i) === 'G'){
            Rna +='C';
        }
        else if(nucleotide.charAt(i)=== 'C'){
            Rna +='G';
        }
        else if(nucleotide.charAt(i)=== 'T'){
            Rna +='A';        
        }
        else if(nucleotide.charAt(i)=== 'A'){
            Rna +='U';        
        }
      }
    
      return Rna;

};
