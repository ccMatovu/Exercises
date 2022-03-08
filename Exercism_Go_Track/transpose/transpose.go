package transpose


	func Transpose(input []string) []string {

	output := make([]string, 0)

	for j, x := range input {
		for i := 0; i < len(x); i++ {
			char := string(x[i])
			if len(output) < i+1 {
                for space := j; space>0; space--{
                    char = " "+char
                } 
				output = append(output, char)
			} else {
                    for len(output[i]) < j{
                        output[i] += " "
                    }
				output[i] += char
			}
		}
	}
	return output
}

