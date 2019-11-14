/**
 * @author Jesus Vazquez
 */

public class HexMineManager {

    public static String[][] createBoard (int boardSize) {
        
        String [][] board = new String[boardSize][boardSize];

        for (int i = board.length/4; i < (board.length - board.length/4); i++) {
            if (i < board.length/2) {
                for (int j = 0; j < board.length; j++) {
                    
                    if (j < (board.length/2 - i)) {
                        board[i][j] = " ";
                    }
                    else if (j > (board.length/2 - i)  && j < (board.length/2 + i)) {
                         board[i][j] = "c";
                    }
                    else {
                        board[i][j] = " ";
                    }
                     
                }
            }
            else if(i == board.length/2) {
                for (int j = 0; j < board.length; j++) {
                        board[i][j] = "c";
                    }    
                }
            else {
                
                 for (int j = 0; j < board.length; j++) {
                       if (j < (board.length/2 - (board.length - (i)))) {
                           board[i][j] = " ";
                       }
                      else if (j < (board.length/2 + (board.length - (i)))) {
                           board[i][j] = "c";
                       }
                     else {
                         board[i][j] = " ";
                     }
                    }
                
            }
        }
        
        return board;
                        
    }
                         
    
    public static void printBoard (String [][] inputBoard) {
        
        for (int i = 0; i < inputBoard.length; i++) {
            String rs = "";
            for (int j = 0; j < inputBoard[i].length; j++) {
                if (inputBoard[i][j] != null) {
                    rs = rs + inputBoard[i][j];
                }
            }
            System.out.println(rs);
        }
    }
    
        public static void main(String [] args) {
        printBoard(createBoard(30));
    }

}


//     /**
//  * @author Jesus Vazquez
//  * HexMineManager
//  */

// public class HexMineManager extends piece {

//     Piece[][] board;

//     /**
//      * Initializes the game
//      * reset everything -> makes board ->calls your mine counter)
//      * @param boardsize
//      * @param minenumber
//      */
//     public HexMineManager(int boardsize, int minenumber){
//         board = new Piece[boardsize][boardsize];
//         System.out.println(boardsize);
//     }

//     /**
//      * Prints current state
//      */
//     public static void printBoard (String [][] inputBoard) {
        
//         for (int i = 0; i < inputBoard.length; i++) {
//             String rs = "";
//             for (int j = 0; j < inputBoard[i].length; j++) {
//                 if (inputBoard[i][j] != null) {
//                     rs = rs + inputBoard[i][j];
//                 }
//             }
//             System.out.println(rs);
//         }
//     }

//     /**
//      * + adds numbers on surrounding mines)
//      */
//     void mineCounter(int board, int row, int col){
    
//     }

//     /**
//      * if its 0 it uncovers all of the neighbors, if number it just flips it, if bomb -> end game
//      */
//     void pieceUncover(){

//     }

//     /**
//      * flags on and flag off -> flags = no. bombs then win or lose
//      */
//     void bombflagger(){

//     }

//     /**
//      * Here we printing the board
//      * @param args
//      */
//     public static void printBoard (String [][] inputBoard) {

//     }

// }    