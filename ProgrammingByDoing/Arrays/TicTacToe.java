import java.util.Scanner;

public class TicTacToe {
    private static char[][] board = new char[3][3];

    public static void main( String[] args )
    {
        Scanner keyboard = new Scanner(System.in);

        initBoard();
        displayBoard();
        int moves=0;
        int row,column;
        char player ='O';

        while(moves != 9){
            moves++;
            System.out.print("\n"+player+", choose your location (row, column): ");
            row = keyboard.nextInt();
            column = keyboard.nextInt();
            board[row][column]=player;
            boolean check = gameWon(player);
            if(check){
                displayBoard();
                System.out.println(player+" has won!");
                break;
            }
            displayBoard();
            if(player == 'O'){
                player ='X';
            }else {
                player = 'O';
            }
        }
        if(moves ==9){
            System.out.println("The game is a tie.");
        }

    }

    public static void initBoard()
    {
        // fills up the board with blanks
        for ( int r=0; r<3; r++ )
            for ( int c=0; c<3; c++ )
                board[r][c] = ' ';
    }

    public static void displayBoard()
    {
        System.out.println("  0  " + board[0][0] + "|" + board[0][1] + "|" + board[0][2]);
        System.out.println("    --+-+--");
        System.out.println("  1  " + board[1][0] + "|" + board[1][1] + "|" + board[1][2]);
        System.out.println("    --+-+--");
        System.out.println("  2  " + board[2][0] + "|" + board[2][1] + "|" + board[2][2]);
        System.out.println("     0 1 2 ");
    }


    public static void displayBoard2()
    {
        for ( int r=0; r<3; r++ )
        {
            System.out.print("\t"+r+" ");
            for ( int c=0; c<3; c++ )
            {
                System.out.print( board[r][c] + " " );
            }
            System.out.println();
        }
        System.out.println("\t  0 1 2 ");
    }
    public static boolean gameWon( char player )
    {
        for ( int r = 0; r < 3; r++ )
        {
            if ( player == board[r][0] && board[r][0] == board[r][1] && board[r][1] == board[r][2] )
                return true;
        }

        for ( int c = 0; c < 3; c++ )
        {
            if ( player == board[0][c] && board[0][c] == board[1][c] && board[1][c] == board[2][c] )
                return true;
        }

        if ( player == board[0][0] && board[0][0] == board[1][1] && board[1][1] == board[2][2] )
            return true;
        else if ( player == board[0][2] && board[0][2] == board[1][1] && board[1][1] == board[2][0] )
            return true;

        return false;
    }
}
