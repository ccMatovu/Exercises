package blackjack

// ParseCard returns the integer value of a card following blackjack ruleset.
func ParseCard(card string) int {
	switch card {
	case "ace":
		return 11
	case "two":
		return 2
	case "three":
		return 3
	case "four":
		return 4
	case "five":
		return 5
	case "six":
		return 6
	case "seven":
		return 7
	case "eight":
		return 8
	case "nine":
		return 9
	case "ten":
		return 10
	case "jack", "queen", "king":
		return 10
	default:
		return 0
	}
}

// IsBlackjack returns true if the player has a blackjack, false otherwise.
func IsBlackjack(card1, card2 string) bool {
	return ParseCard(card1) + ParseCard(card2) == 21
}

// LargeHand implements the decision tree for hand scores larger than 20 points.
func LargeHand(isBlackjack bool, dealerScore int) string {
	switch isBlackjack {
	case true:
		switch {
		case dealerScore < 10:
			return "W"
		default:
			return "S"
		}
	default:
		return "P"
	}
}

// SmallHand implements the decision tree for hand scores with less than 21 points.
func SmallHand(handScore, dealerScore int) string {
	hand := "H"

	switch {
	case (handScore >= 17):
		hand = "S"
	case handScore <= 11:
		hand = "H"
	case (handScore >= 12) && (handScore <= 16):
		switch {
		case dealerScore <= 6:
			hand = "S"
		case dealerScore >= 7:
			hand = "H"
		}
	}
	return hand
}

