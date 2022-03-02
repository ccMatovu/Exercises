package leap

func IsLeapYear(yr int) bool {
	if yr%4 == 0 {
		if yr%100 == 0 {
			if yr%400 == 0 {
				return true
			}
			return false
		}
		return true
	}
	return false

}

