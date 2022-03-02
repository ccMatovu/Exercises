package prime


func Nth(n int) (int, bool) {
	if n <= 0 {
		return 0, false
	}
	primeNumbers := getPrimes(n)
	return primeNumbers[n-1], true
}

func getPrimes(n int) (primeNumbers []int) {
	candidate := 2
    
	for len(primeNumbers) != n {
		if isPrime(candidate) {
			primeNumbers = append(primeNumbers, candidate)
		}
		candidate += 1
	}
	return primeNumbers
}

func isPrime(x int) bool {
	for i := 2; i < x; i++ {
		if x%i == 0 {
			return false
		}
	}
	return true
}
