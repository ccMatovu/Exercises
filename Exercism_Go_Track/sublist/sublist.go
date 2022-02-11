package sublist
import ("strings"
        "strconv"
        )

func Sublist(l1, l2 []int) string {
	var s1 strings.Builder
	s2 := ""
	for _, x := range l1 {
		temp := strconv.Itoa(x)
		s1.WriteString(temp)
	}
	for _, c := range l2 {
		s2 += strconv.Itoa(c)
	}
	if s1.String() == s2 {
		return "A is equal to B"
	}
	if strings.Contains(s1.String(), s2) {
		return "A is a superlist of B"
	}
	if strings.Contains(s2, s1.String()) {
		return "A is a sublist of B"
	}
	return "A is not a superlist of, sublist of or equal to B"
}
