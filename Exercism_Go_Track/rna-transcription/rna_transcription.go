package strand

func ToRNA(dna string) string {
    rna := ""
	for _, char := range dna{
        switch char {
            case 'G':
        		rna += string('C')
            case 'C':
        		rna += string('G')
            case 'T':
        		rna += string('A')
            case 'A':
        		rna += string('U')
        }
    }
	return rna
}
