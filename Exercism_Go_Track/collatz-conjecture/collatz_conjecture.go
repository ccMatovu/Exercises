package collatzconjecture
import "errors"
func CollatzConjecture(n int) (int, error) {
    var count int
	if n < 1 {
		return 0, errors.New("zero is an error")
	}

	for n != 1 {
		count++
		//fmt.Println(count)
		if n%2 == 0 {
			n = n / 2
		} else {
			n = (3 * n) + 1
		}
	}
	return count, nil
}
