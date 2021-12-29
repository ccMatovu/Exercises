// Package weather provides tools to deal with weather.
package weather

// CurrentCondition represents the current weather.
var CurrentCondition string

//CurrentLocation represents the current location.
var CurrentLocation string

//Forecast takes the city and returns the weather forcast for the city.
func Forecast(city, condition string) string {
	CurrentLocation, CurrentCondition = city, condition
	return CurrentLocation + " - current weather condition: " + CurrentCondition
}
