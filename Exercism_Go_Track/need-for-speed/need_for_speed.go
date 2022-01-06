package speed

// TODO: define the 'Car' type struct

// NewCar creates a new remote controlled car with full battery and given specifications.
type Car struct {
	battery      int
	batteryDrain int
	speed        int
	distance     int
}
type Track struct {
	distance int
}

func NewCar(speed, batteryDrain int) Car {
	newCar := Car{
		batteryDrain: batteryDrain,
		speed:        speed,
	}
	newCar.battery = 100
	return newCar
}

// TODO: define the 'Track' type struct

// NewTrack created a new track
func NewTrack(distance int) Track {
	track := Track{
		distance: distance,
	}
	return track
}

// Drive drives the car one time. If there is not enough battery to drive on more time,
// the car will not move.
func Drive(car Car) Car {
	if car.battery >= car.batteryDrain {
		car.battery = car.battery - car.batteryDrain
		car.distance = car.distance + car.speed
	}
	return car
}

// CanFinish checks if a car is able to finish a certain track.
func CanFinish(car Car, track Track) bool {	
	numberOfDrives := car.battery / car.batteryDrain
	possibleDistance := numberOfDrives * car.speed
	return car.distance + possibleDistance >= track.distance
}
