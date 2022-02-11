package sublist
import ("strings"
        "strconv"
        )

type Relation string


func Sublist(l1, l2 []int) Relation {
	var s strings.Builder
	s2 := ""
	for _, n := range l1 {
		temp := strconv.Itoa(n)
		s.WriteString(temp)
		s.WriteString(",")
	}
	for _, c := range l2 {
		s2 += strconv.Itoa(c)+","
	}
	if s.String() == s2 {
		return "equal"
	}
	if strings.Contains(s.String(), s2) {
		return "superlist"
	}
	if strings.Contains(s2, s.String()) {
		return "sublist"
	}
	return "unequal"
}
