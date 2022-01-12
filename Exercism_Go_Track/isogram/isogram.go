package isogram
import ("unicode"
         "strings")

func IsIsogram(word string) bool {
    word = strings.ToLower(word)
    for i, character := range word {
		for index, letter := range word {
			if i != index && character == letter {
				if unicode.ToUpper(character) != unicode.ToLower(letter) {
					return false
				}
			}
		}
	}
	return true
}
