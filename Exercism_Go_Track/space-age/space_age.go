package space

type Planet string

func Age(seconds float64, planet Planet) float64 {
	var earthYear float64 = 31557600
	var earthYears float64= seconds / earthYear
	var age float64 

	switch planet {
	case "Earth":
		age = earthYears
	case "Mercury":
			age = earthYears / 0.2408467
	case "Venus":
			age = earthYears / 0.61519726
	case "Mars":
			age = earthYears / 1.8808158
	case "Jupiter":
			age = earthYears / 11.862615
	case "Saturn":
			age = earthYears / 29.447498
	case "Uranus":
			age = earthYears / 84.016846
	case "Neptune":
			age = earthYears / 164.79132	
	}
	return age
}
