package allyourbase
import "errors"

func ConvertToBase(inputBase int, inputDigits []int, outputBase int) ([]int, error) {
    if inputBase < 2 {
        return []int{}, errors.New("input base must be >= 2")
    }

    numInBaseTen, err := toBaseTen(inputDigits, inputBase)
    if err != nil {
        return []int{}, err
    }

	numToBase,err := toBaseX(numInBaseTen, outputBase)
    if err != nil{
        return []int{}, err
    }
	return numToBase, nil
}

func toBaseX(num, base int) ([]int,error) {
    if base < 2{
        return []int{},errors.New("output base must be >= 2")
    }
	ans := make([]int, 0)
	for num >= base {
		remainder := num % base
		num = num / base
		ans = append([]int{remainder}, ans...)
	}
		ans = append([]int{num}, ans...)
	return ans, nil
}

func toBaseTen(num []int, base int) (int,error) {
	var ans int
	for i, j := len(num)-1, 0; i >= 0; i, j = i-1, j+1 {
		digit := num[i]
        if (digit < 0) || (digit >= base){
            return ans, errors.New("all digits must satisfy 0 <= d < input base")
        }
		place := power(base, j)
		ans += digit * place
	}
	return ans, nil
}

func power(base, expo int) int {
	var ans int = 1
	for i := expo; i > 0; i-- {
		ans = ans * base
	}
	return ans
}
