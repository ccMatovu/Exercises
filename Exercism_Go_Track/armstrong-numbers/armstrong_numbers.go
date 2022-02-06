package armstrong
 import ("math"
		"strconv")
func IsNumber(n int) bool {
	var sum float64
	num := strconv.Itoa(n)
	power := len(num)
	
	for i := 0; i < power; i++{
		digit,_ := strconv.Atoi(string(num[i]))
		sum += math.Pow(float64(digit),float64(power))
	}
	if int(sum) == n {
		return true
	}

	return false
}
