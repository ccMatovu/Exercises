package lsproduct
import "errors"

func LargestSeriesProduct(digits string, span int) (int64, error) {
	if span > len(digits) {
		return -1, errors.New("span must be smaller than string length")
	} else if digits == "" {
		return 1, nil
	} else if span < 0 {
		return -1, errors.New("span must not be negative")
	}
	var largestProduct int = 0
	for i := range digits {
		var product int = 1
		count := 0
		for j := i; j < (span+i) && j < len(digits); j++ {
			number := digits[j]
			if number < 47 || number > 58 { // runes '0' and '9'
				return -1, errors.New("digits input must only contain digits")
			}
			product *= int(number - 48)
			count++
		}
		if (product > largestProduct) && (count == span) {
			largestProduct = product
		}
	}
	return int64(largestProduct), nil
}

// BenchmarkLargestSeriesProduct-16         1354052               863.8 ns/op
// PASS
// ok      lsproduct       1.998s
