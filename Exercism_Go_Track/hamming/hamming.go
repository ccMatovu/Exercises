package hamming
import "errors"

func Distance(a, b string) (int, error) {
        var count int
    if len(a) != len(b) {
		return count, errors.New("a and b must be of equal length")
	}
	stringA := []rune(a)
    stringB := []rune(b)
    for i,char := range stringA {
        if char != stringB[i] {
            count++
        }
    }
	return count, nil
}
