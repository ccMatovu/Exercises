package beer
import (
	"fmt"
	"strings"
    "errors"
)

func Song() string {
	song, _ := Verses(99, -1)
	return song
}

func Verse(n int) (string, error) {
    if n > 99 {
		return "", errors.New("invalid")
    }
	if n == 1 {
		return fmt.Sprintf("%d bottle of beer on the wall, %d bottle of beer.\nTake it down and pass it around, no more bottles of beer on the wall.\n", n, n), nil
	}
	if n == 0 {
		return fmt.Sprintf("No more bottles of beer on the wall, no more bottles of beer.\nGo to the store and buy some more, 99 bottles of beer on the wall.\n"), nil
	}
	if n == 2{
        return fmt.Sprintf("%d bottles of beer on the wall, %d bottles of beer.\nTake one down and pass it around, %d bottle of beer on the wall.\n",n,n,n-1),nil
    }
	return fmt.Sprintf("%d bottles of beer on the wall, %d bottles of beer.\nTake one down and pass it around, %d bottles of beer on the wall.\n", n, n, n-1), nil
}

func Verses(start, stop int) (string, error) {
	var verses strings.Builder
    if start > 99 || start < stop || stop < -1{
        return "",errors.New("invalid")
    }

	for  start > stop-1 && start > -1  {
		verse, _ := Verse(start)
		verses.WriteString(verse)
		verses.WriteString("\n")
		start--
	}
	return verses.String(), nil

}
