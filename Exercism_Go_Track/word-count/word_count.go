package wordcount
import "strings"

type Frequency map[string]int

func WordCount(phrase string) Frequency {
	words := strings.FieldsFunc(phrase, CheckFields)
	count := Frequency{}
	for _, word := range words {
		temp := strings.ToLower(word)
		temp = strings.Trim(temp, "!!&@$%^&:;.'")
		count[temp]++
	}
	return count
}

func CheckFields(char rune) bool {
	switch char {
	case '\t','\n',11, 12, '\r':
		return true
	case ' ', 133,',':
		return true
	}
	return false
}

