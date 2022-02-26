package isbn

func IsValidISBN(isbn string) bool  {
	sop := 0
	count := 10
	for i,num := range isbn {
		if num >= 48 && num <= 57{  //between 0 and 9 in unicode
			sop += int(num - '0') * count
			count--
		}else if num == 'X' && i == len(isbn)-1{
			sop += 10 * count
			count--
		}else if num == '-'{
			continue
		}else{
			return false
		}
	}
	return sop % 11 == 0 && count == 0
}

// BenchmarkIsValidISBN-16          6029314               185.9 ns/op
// PASS
// ok      isbn    1.325s