package data_type;

public class Tic_Tac {
	
	    char[][] board;
	    char currentPlayer;

	    Tic_Tac() {
	        board = new char[3][3];
	        currentPlayer = 'X';
	        initializeBoard();
	    }

	    void initializeBoard() {
	        for (int i = 0; i < 3; i++) {
	            for (int j = 0; j < 3; j++) {
	                board[i][j] = '-';
	            }
	        }
	    }

	    void printBoard() {
	        for (int i = 0; i < 3; i++) {
	            System.out.println();
	            for (int j = 0; j < 3; j++) {
	                System.out.print(board[i][j] + " | ");
	            }
	        }
	        System.out.println();
	    }

	    void makeMove(int row, int col) {
	        if (row >= 0 && row < 3 && col >= 0 && col < 3 && board[row][col] == '-') {
	            board[row][col] = currentPlayer;
	            currentPlayer = (currentPlayer == 'X') ? 'O' : 'X';
	        } else {
	            System.out.println("Invalid move, try again.");
	        }
	    }

	    boolean checkWin() {
	        for (int i = 0; i < 3; i++) {
	            if (board[i][0] != '-' && board[i][0] == board[i][1] && board[i][1] == board[i][2]) {
	                return true;
	            }
	            if (board[0][i] != '-' && board[0][i] == board[1][i] && board[1][i] == board[2][i]) {
	                return true;
	            }
	        }
	        if (board[0][0] != '-' && board[0][0] == board[1][1] && board[1][1] == board[2][2]) {
	            return true;
	        }
	        if (board[0][2] != '-' && board[0][2] == board[1][1] && board[1][1] == board[2][0]) {
	            return true;
	        }
	        return false;
	    }

	    boolean checkDraw() {
	        for (int i = 0; i < 3; i++) {
	            for (int j = 0; j < 3; j++) {
	                if (board[i][j] == '-') {
	                    return false;
	                }
	            }
	        }
	        return true;
	    }
	}

