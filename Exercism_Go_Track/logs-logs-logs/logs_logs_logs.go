package logs
var LogMap = map[string]int32{
	"recommendation": 10071,
	"search":         128269,
	"weather":        9728,
}
// Application identifies the application emitting the given log.
func Application(log string) string {
	var application string = "default"
loop:
	for _, char := range log {
		for app, utfChar := range LogMap {
			if char == utfChar {
				application = app
				break loop
			}
		}
	}
	return application
}

// Replace replaces all occurrences of old with new, returning the modified log
// to the caller.
func Replace(log string, oldRune, newRune rune) string {
    newLog := make([]rune, 0)
	for _, char := range log {
		if char == oldRune {
			newLog = append(newLog, newRune)
		} else {
			newLog = append(newLog, char)
		}
	}
	return string(newLog)
}

// WithinLimit determines whether or not the number of characters in log is
// within the limit.
func WithinLimit(log string, limit int) bool {
    logRunes := []rune(log)
	return len(logRunes) <= limit
}
