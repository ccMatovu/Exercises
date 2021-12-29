package techpalace
import (
        "strings")
// WelcomeMessage returns a welcome message for the customer.
func WelcomeMessage(customer string) string {
   const welcome = "Welcome to the Tech Palace, "
	return welcome + strings.ToUpper(customer)
}

// AddBorder adds a border to a welcome message.
func AddBorder(welcomeMsg string, numStarsPerLine int) string {
    stars := ""
	for i := 0; i < numStarsPerLine; i++ {
		stars += "*"
	}
	return stars + "\n" + welcomeMsg + "\n" + stars
}

// CleanupMessage cleans up an old marketing message.
func CleanupMessage(oldMsg string) string {
	var star uint8 = 42
	var newMsg string
	for i := 0; i < len(oldMsg); i++ {
		if oldMsg[i] != star {
			newMsg += string(oldMsg[i]) 
		}
	}
	return strings.Trim(newMsg, " \n")
}
