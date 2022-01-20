package acronym
import "strings"
func Abbreviate(s string) string {
    var acronym strings.Builder 
    acronym.WriteByte(s[0])
    var cha uint8
	for index, char := range s {
		if (char < 65 || char > 90) && (char < 97 || char > 122 ) && char != 39 {
            if index + 1 < len(s){
        	cha = s[index+1]
        }
			if(cha >= 65 && cha <= 90) || (cha >= 97 && char <= 122){
                acronym.WriteByte(cha)
            }
		}
	}
	return strings.ToUpper(acronym.String())
}
