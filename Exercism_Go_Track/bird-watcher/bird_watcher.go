package birdwatcher

// TotalBirdCount return the total bird count by summing
// the individual day's counts.
func TotalBirdCount(birdsPerDay []int) int {
	var total int

	for _, numOfBirds := range birdsPerDay {
		total += numOfBirds
	}
	return total
}

// BirdsInWeek returns the total bird count by summing
// only the items belonging to the given week.
func BirdsInWeek(birdsPerDay []int, week int) int {
	var total int
	for i, birds := range birdsPerDay {
		if i/7 == week-1 {
			total += birds
		}
	}
	return total

}

// FixBirdCountLog returns the bird counts after correcting
// the bird counts for alternate days.
func FixBirdCountLog(birdsPerDay []int) []int {
	for i := 0; i < len(birdsPerDay); i += 2 {
		birdsPerDay[i] = birdsPerDay[i] + 1
	}
	return birdsPerDay
}
