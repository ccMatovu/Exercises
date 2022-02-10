package wordy

import ("strings"
        "strconv")

func Answer(question string) (int, bool) {
	nums, ops := getNumbers(question)

    if (len(nums) < 1 ) || (len(nums) != len(ops) + 1){
        return 0, false
    }
    
    sum := nums[0]
    if len(ops) < 1 {
        return int(sum), true
    }
    answer := true
	for i, j := 1, 0; j < len(ops); i, j = i+1, j+1 {
		switch ops[j] {
		case "plus":
			sum = sum + nums[i]
		case "multiplied":
			sum = sum * nums[i]
		case "minus":
			sum = sum - nums[i]
		case "divided":
			sum = sum / nums[i]
        case "cubed":
        	answer = false
		}
	}
	return int(sum), answer

}

func getNumbers(question string) ([]int64, []string) {
	f := func(c rune) bool {
		switch c {
		case '?':
			return true
		case ' ':
			return true
		}
		return false
	}
	seqs := strings.FieldsFunc(question, f)
	nums := make([]int64, 0)
	ops := make([]string, 0)
	for _, n := range seqs {
		if num, err := strconv.ParseInt(n, 0, 64); err == nil {
			nums = append(nums, num)
		} else if n == "plus" {
			ops = append(ops, n)
		} else if n == "multiplied" {
			ops = append(ops, n)
		} else if n == "divided" {
			ops = append(ops, n)
		} else if n == "minus" {
			ops = append(ops, n)
		} else if n == "cubed" {
        	ops = append(ops, n)
        }
	}
	return nums, ops
}