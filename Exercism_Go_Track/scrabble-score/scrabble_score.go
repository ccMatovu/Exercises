package scrabble
import "strings"

var letterValues = map[string]int{
	"AEIOULNRST": 1,
	"DG":         2,
	"BCMP":       3,
	"FHVWY":      4,
	"K":          5,
	"JX":         8,
	"QZ":         10,
}

func Score(word string) int {
	var score int
	word = strings.ToUpper(word)
	for _, char := range word {
		for letters, value := range letterValues {
			if strings.ContainsRune(letters, char) {
				score += value
			}
		}
	}
	return score
}

