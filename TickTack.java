import java.util.Scanner;

public class TickTack {
     public static void main(String[] args) {
		char[][] board = new char[3][3];
		for (int row = 0; row < board.length; row++) {
			for (int col = 0; col < board[row].length; col++) {
				board[row][col]= ' ';
			}
		}
		char player = 'X';
		Scanner sc = new Scanner(System.in);
		boolean gameover = false;
		while(!gameover) {
		    printBoard(board);
			System.out.print("Player "+ player + "  enter :");
			int row = sc.nextInt();
			int col = sc.nextInt();
			
			if(board[row][col]== ' ') {
				board[row][col]=player;
				gameover = HaveWon(board,player);
				if(gameover) {
					System.out.println("Player "+player+" has won"); 
					printBoard(board);
				}
				else {
					player = (player=='X')?'O':'X';
				}
			}
			else {
				System.out.println("Invalid move try again or Match draw");
			}
		}
		
	}
    public static void printBoard(char[][] board) {
    	for (int row = 0; row < board.length; row++) {
			for (int col = 0; col < board[row].length; col++) {
				System.out.print(board[row][col]+ " | ");
			}
			System.out.println();
			System.out.println("-----------");
		}
    }
    public static boolean HaveWon(char[][] board , char player) {
    	for(int row=0;row<board.length;row++) {
    		if(board[row][0]==player && board[row][1]==player && board[row][2]==player) {
    			return true;
    		}
    	}
    	for(int col=0;col<board[0].length;col++) {
    		if(board[col][0]==player && board[col][1]==player && board[col][2]==player) {
    			return true;
    		}
    	}
    	if(board[0][0]== player && board[1][1]==player && board[2][2]==player) {
    		return true;
    	}
    	if(board[0][2]==player && board[1][1]==player && board[2][0]==player) {
    		return true;
    	}
    	
    	
    	return false;
    }
}
