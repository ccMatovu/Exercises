package clock

import "fmt"
// Define the Clock type here.
type Clock struct{
    hours int
    minutes int
}

func New(h, m int) Clock {  
	for m >= 60 {
        m = m - 60
        h++
    }
	for m < 0 {
        m = m + 60
        h--
    }
	if h >= 24 {
        h = h % 24
    }
	for h < 0 {
    	h = 24 - (-h)
    }
	return Clock{
        hours: h,
        minutes: m,
    }	
}

func (c Clock) Add(m int) Clock {
		return New(c.hours, c.minutes + m)
}

func (c Clock) Subtract(m int) Clock {
	return New(c.hours, c.minutes - m)
}

func (c Clock) String() string {
	return fmt.Sprintf("%02d:%02d",c.hours, c.minutes)
}
