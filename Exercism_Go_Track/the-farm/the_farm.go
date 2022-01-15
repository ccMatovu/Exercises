package thefarm
import ("errors"
        "fmt"
        )

// See types.go for the types defined for this exercise.

// TODO: Define the SillyNephewError type here.

// DivideFood computes the fodder amount per cow for the given cows.
func DivideFood(weightFodder WeightFodder, cows int) (float64, error) {
	fodderAmount, err := weightFodder.FodderAmount()

	if err == ErrScaleMalfunction {
		fodderAmount *= 2
	} else if err != nil {
		return 0.0, err
	}

	if fodderAmount < 0 {
		return 0.0, errors.New("negative fodder")
	}

	if cows == 0 {
		return 0.0, errors.New("division by zero")
	}

	if cows < 0 {
		return 0.0, fmt.Errorf("silly nephew, there cannot be %d cows", cows)
	}

	return fodderAmount / float64(cows), nil
}
