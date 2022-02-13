package collatzconjecture

func CollatzConjecture(n int) (int, error) {
    var count int
	for n != 1 {
		count++
		if n%2 == 0 {
			n = n / 2
		} else {
			n = (3 * n) + 1
		}
	}
	return count, nil
}
