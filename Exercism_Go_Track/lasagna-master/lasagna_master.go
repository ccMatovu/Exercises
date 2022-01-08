package lasagna

// TODO: define the 'PreparationTime()' function
func PreparationTime(layers []string, time int) int {
	if time == 0 {
		time = 2
	}
	return len(layers) * time
}


// TODO: define the 'Quantities()' function
func Quantities(layers []string) (noodles int, sauce float64) {
	for _, food := range layers {
		switch food {
		case "sauce":
			sauce += 0.2
		case "noodles":
			noodles += 50
		}
	}
	return
}

// TODO: define the 'AddSecretIngredient()' function
func AddSecretIngredient(friendsList, myList []string)[]string {
	myList[len(myList)-1] = friendsList[len(friendsList)-1]
	return myList
}

// TODO: define the 'ScaleRecipe()' function
func ScaleRecipe(quantities []float64, portions int) []float64 {
	amounts := make([]float64, len(quantities))
	for index, amount := range quantities {
		amounts[index] = (amount / 2) * float64(portions)
	}
	return amounts
}
