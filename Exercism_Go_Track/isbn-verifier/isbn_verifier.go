package isbn

import "unicode"
func IsValidISBN(isbn string) bool {
	sop := 0
	count := 10
	cleanNum, clean := cleanNumber(isbn)
	if !clean {
		return false
	}
	for _, number := range cleanNum {
		sop += number * count
		count--
	}
	return sop%11 == 0
}

func cleanNumber(isbn string) ([]int, bool) {
	cleanNum := make([]int, 0)
	for i, num := range isbn {
		if unicode.IsNumber(num) {
			cleanNum = append(cleanNum, int(num-'0'))
		} else if (i == len(isbn)-1) && (num == 'X') {
			cleanNum = append(cleanNum, 10)
		}
	}
	if len(cleanNum) != 10 {
		return cleanNum, false
	}
	return cleanNum, true
}

// BenchmarkIsValidISBN-16           216424              5208 ns/op
// PASS
// ok      isbn    1.187s
