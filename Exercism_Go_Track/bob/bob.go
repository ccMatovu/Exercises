
// Package bob should have a package comment that summarizes what it's about.
// https://golang.org/doc/effective_go.html#commentary
package bob
import ("strings"
        "unicode"
        )

// Hey should have a comment documenting it.
func Hey(remark string) string {
	trimRemark := strings.TrimSpace(remark)
	isSilence := trimRemark == ""
	hasLetters := strings.IndexFunc(trimRemark, unicode.IsLetter) >= 0
	isYelling := hasLetters && strings.ToUpper(trimRemark) == trimRemark
	isQuestion := strings.HasSuffix(trimRemark, "?")
	switch {
	case isSilence:
		return "Fine. Be that way!"
	case isYelling && isQuestion:
		return "Calm down, I know what I'm doing!"
	case isYelling:
		return "Whoa, chill out!"
	case isQuestion:
		return "Sure."
	default:
		return "Whatever."
	}
	
}
