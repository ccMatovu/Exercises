package partyrobot

import ("fmt"
        "strconv")

// Welcome greets a person by name.
func Welcome(name string) string {
	return fmt.Sprintf("Welcome to my party, %s!", name)
}

// HappyBirthday wishes happy birthday to the birthday person and exclaims their age.
func HappyBirthday(name string, age int) string {
	return fmt.Sprintf(`Happy birthday %s! You are now %d years old!`, name, age)
}

// AssignTable assigns a table to each guest.
func AssignTable(name string, table int, neighbor, direction string, distance float64) string {
	tableNumber := func(table int) string {
		if table < 10 {
			return "00" + strconv.Itoa(table)
		}else if table < 100 {
			return "0" + strconv.Itoa(table)
		} 
		return strconv.Itoa(table)
	}(table)

	firstLine := Welcome(name)
	secondLine := fmt.Sprintf(`You have been assigned to table %s. Your table is %s, exactly %.1f meters from here.`, tableNumber, direction, distance)
	thirdLine := fmt.Sprintf(`You will be sitting next to %s.`, neighbor)

	return fmt.Sprintf("%s\n%s\n%s", firstLine, secondLine, thirdLine)

}
