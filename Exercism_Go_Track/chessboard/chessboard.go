package chessboard

// Declare a type named Rank which stores if a square is occupied by a piece - this will be a slice of bools
type Rank []bool
// Declare a type named Chessboard which contains a map of eight Ranks, accessed with keys from "A" to "H"
type Chessboard map[string]Rank

// CountInRank returns how many squares are occupied in the chessboard,
// within the given rank
func CountInRank(cb Chessboard, rank string) int {
	var squares int
    ranks := cb[rank]
    for _, square := range ranks {
        if square {
            squares++
        }
    }
return squares
}

// CountInFile returns how many squares are occupied in the chessboard,
// within the given file
func CountInFile(cb Chessboard, file int) int {
	if file > 8 || file < 1 {
		return 0
	}
	var num int
	for _, rank := range cb {
		if rank[file-1] {
			num += 1
		}
	}
	return num
}

// CountAll should count how many squares are present in the chessboard
func CountAll(cb Chessboard) int {
    var total int
	for _, rank := range cb {
		for range rank {
			total += 1
		}
	}
	return total
}

// CountOccupied returns how many squares are occupied in the chessboard
func CountOccupied(cb Chessboard) int {
    var total int
	for _, rank := range cb {
		for _, square := range rank {
			if square {
				total += 1
			}
		}
	}
	return total
}
