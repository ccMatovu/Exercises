package reverse

func Reverse(input string) string {
	inputRune := []rune(input)
	outRune := make([]rune, 0)
    for i := len(inputRune)-1; i >= 0; i-- {
		outRune = append(outRune, inputRune[i])
	}
	return string(outRune)
}
