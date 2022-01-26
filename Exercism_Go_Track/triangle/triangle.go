// This is a "stub" file.  It's a little start on your solution.
// It's not a complete solution though; you have to write some code.

// Package triangle should have a package comment that summarizes what it's about.
// https://golang.org/doc/effective_go.html#commentary
package triangle


// Notice KindFromSides() returns this type. Pick a suitable data type.
type Kind string

const (
    // Pick values for the following identifiers used by the test program.
    NaT  Kind = "Nat"// not a triangle
    Equ  Kind = "Equ"// equilateral
    Iso  Kind = "Iso"// isosceles
    Sca  Kind = "Sca"// scalene
)

// KindFromSides should have a comment documenting it.
func KindFromSides(a, b, c float64) Kind {
	var triangle Kind = NaT
    if (a+b < c) || (a+c < b) || (b+c < a){
        return NaT
    }  
	if a <= 0 || b <= 0 || c <= 0  {
		return NaT
	}
	if (a == b) && (b == c) {
		return Equ
	}	
	if a == b || b == c || c == a {     
		return Iso
	}	
	if a != b && b != c && c != a {
		return Sca
	}
	return triangle 
}