package darts

import "math"

func Score(x, y float64) int {
    outerRadius := 10
    middleRadius := 5
    innerRadius := 1
	if isInCircle(x, y, innerRadius) {
		return 10
	} else if isInCircle(x, y, middleRadius) {
		return 5
	} else if isInCircle(x, y, outerRadius) {
		return 1
	}
	return 0
}

func isInCircle(x float64, y float64, radius int) bool {
    distance := math.Sqrt(math.Pow(x, 2) + math.Pow(y, 2))
	return distance <= float64(radius)
}


