package anagram
import "strings"

func Detect(subject string, candidates []string) []string {
	anagrams := []string{}
    for _,prospect := range candidates{
		anagram := true
		candidate := strings.ToUpper(prospect)
		subjectTest := strings.ToUpper(subject)
        for _,char := range candidate{
            character := string(char)
			if !strings.Contains(subjectTest, character) {
				anagram = false
				break
			}
			subjectTest = strings.Replace(subjectTest, character, "", 1)
		}
		if len(candidate) == len(subject) && candidate != subject && anagram{
			anagrams = append(anagrams, prospect)
		}
	}
	return anagrams
}