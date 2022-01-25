package protein
import ("errors"
        )

func FromRNA(rna string) ([]string, error) {
	proteins := make([]string, 0)
	for i := 0; i < len(rna); i += 3 {
		codon := rna[i:i+3]
        protein, err := FromCodon(codon)
        if errors.Is(err,ErrStop) {
            return proteins, nil
        }
    	if errors.Is(err,ErrInvalidBase){
            return []string{}, err
        }
		proteins = append(proteins, protein)
	}
	return proteins, nil
}
var ErrStop error = errors.New("stop codon")

var ErrInvalidBase error = errors.New("invalid base")

func FromCodon(codon string) (string, error) {
	switch codon{
        case "AUG":
    		return "Methionine", nil
        case "UUU", "UUC":
    		return "Phenylalanine", nil
        case "UUA", "UUG":
    		return "Leucine", nil
        case "UCU", "UCC", "UCA", "UCG":
    		return "Serine", nil
        case "UAU", "UAC":
    		return "Tyrosine", nil
        case "UGU", "UGC":
    		return "Cysteine", nil
        case "UGG":
    		return "Tryptophan", nil
        case "UAA", "UAG", "UGA":
    		return "", ErrStop
        default:
    		return "",ErrInvalidBase
    }

    return "", errors.New("Invalid")
}
