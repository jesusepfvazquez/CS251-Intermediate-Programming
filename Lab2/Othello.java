// Jesus Vazquez
// cs251
// Due 10/12/2018

// Description by http://www.othelloonline.org/

// "Both players take it in turns to make their move which consists of placing 
// one piece down in a legally acceptable position and then turning any of the 
// opposing player’s pieces where applicable. A legal move is one that consists 
// of, for example, a black piece being placed on the board that creates a straight 
// line (vertical, horizontal or diagonal) made up of a black piece at either 
// end and only white pieces in between. When a player achieves this, they must 
// complete the move by turning any white pieces in between the two black so that 
// they line becomes entirely black. This turning action must be completed for every 
// legal turning line that is created with the placing of the new piece.

// It goes without say that while the example assumes the use of black as the moving player, 
// it is applicable both ways.

// Players will then continue to move alternately until they get to the end of the game 
// and a winner is decided. This decision is reached by identifying which of the two 
// opponents has the most pieces on the board."

import cs251.lab2.*;

public class Othello implements OthelloModel{

    // setting the parameters
    Piece[][]board;
    Piece[][]tempboard;
    Piece turn;
    
    // Setting the class evironment
    public Othello(){

        //Setting the board
        board = new Piece[DEFAULT_SIZE][DEFAULT_SIZE];

        //Temp board
        tempboard = new Piece[DEFAULT_SIZE][DEFAULT_SIZE];

        //Turn 
        turn = Piece.DARK;

        for (int i=0; i<DEFAULT_SIZE; i++){
            for (int j=0; j<DEFAULT_SIZE; j++){
                board[i][j] = Piece.EMPTY;
            }
        }

        board[DEFAULT_SIZE/2 - 1][DEFAULT_SIZE/2 - 1] = Piece.LIGHT;
        board[DEFAULT_SIZE/2][DEFAULT_SIZE/2] = Piece.LIGHT;
        board[DEFAULT_SIZE/2 - 1][DEFAULT_SIZE/2] = Piece.DARK;
        board[DEFAULT_SIZE/2][DEFAULT_SIZE/2 - 1] = Piece.DARK;

    }

    // Setting Size of the Board
    public int getSize(){
        int output = DEFAULT_SIZE;
        return output;
    }

    // starting a new game
    public void startNewGame(){  

    }

    // Setting the board
    public String getBoardString(){
        
        String output = "";

        for (int i=0; i<DEFAULT_SIZE; i++){
            for (int j=0; j<DEFAULT_SIZE; j++){
                output = output + board[i][j].toChar();
            }
            output = output + '\n';
        }

        return output;
    }

    //Setting the turn: black or white
    public Piece getCurrentTurn() {
        return turn;
    }

    // Setting the computer player 
    public void setComputerPlayer(java.lang.String opponent){
    }

    //Clicking at 
    public Result handleClickAt(int row, int col){

        // Setting up rules

        //1. The piece is not supposed to be isolated (not touching any other piece)
        if (board[row][col+1].equals(Piece.EMPTY)
        && board[row][col-1].equals(Piece.EMPTY)
        && board[row+1][col].equals(Piece.EMPTY)
        && board[row-1][col].equals(Piece.EMPTY)
        && board[row+1][col+1].equals(Piece.EMPTY)
        && board[row-1][col-1].equals(Piece.EMPTY)
        && board[row+1][col-1].equals(Piece.EMPTY)
        && board[row-1][col+1].equals(Piece.EMPTY)){
            return Result.GAME_NOT_OVER;    
        }

        // 2. Spot must be empty
        if (!board[row][col].equals(Piece.EMPTY)){ 
            return Result.GAME_NOT_OVER;        
            }
        
        // 3. Needs to turn pieces in order to be able to make a move
        int [] numbers = {2,3,4,5,6,7}; // 2 to 7 places away needs to be a piece of a different color

        for(int i : numbers ) {

            if (board[row][col+i].equals(turn)){
                for (int x = 1; x < i; x++){
                    if (!board[row][col+x].equals(turn) && !board[row][col+x].equals(Piece.EMPTY)){

                        for (int y = 0; y <= i; y++){
                            board[row][col+y] = turn;
                        }

                    }
                }
                break;
            }

            if (board[row][col-i].equals(turn)){
                for (int x = 1; x < i; x++){
                    if (!board[row][col-x].equals(turn) && !board[row][col-x].equals(Piece.EMPTY)){

                        for (int y = 0; y <= i; y++){
                            board[row][col-y] = turn;
                        }

                        
                    }
                }
                break;
            }
            
            if (board[row+i][col].equals(turn)){
                for (int x = 1; x < i; x++){
                    if (!board[row+x][col].equals(turn) && !board[row+x][col].equals(Piece.EMPTY)){

                        for (int y = 0; y <= i; y++){
                            board[row+y][col] = turn;
                        }

                        
                    }
                }
                break;
            }

            if (board[row-i][col].equals(turn)){
                for (int x = 1; x < i; x++){
                    if (!board[row-x][col].equals(turn) && !board[row-x][col].equals(Piece.EMPTY)){

                        for (int y = 0; y <= i; y++){
                            board[row-y][col] = turn;
                        }

                        
                    }
                }
                break;
            }
            
            if (board[row-i][col-i].equals(turn)){
                for (int x = 1; x < i; x++){
                    if (!board[row-x][col-x].equals(turn) && !board[row-x][col-x].equals(Piece.EMPTY)){

                        for (int y = 0; y <= i; y++){
                            board[row-y][col-y] = turn;
                        }
                        
                    }
                }
                break;
            }
                    
            if (board[row+i][col+i].equals(turn)){
                for (int x = 1; x < i; x++){
                    if (!board[row+x][col+x].equals(turn) && !board[row+x][col+x].equals(Piece.EMPTY)){

                        for (int y = 0; y <= i; y++){
                            board[row+y][col+y] = turn;
                        }
                        
                    }
                }
                break;
            }

            if (board[row+i][col-i].equals(turn)){
                for (int x = 1; x < i; x++){
                    if (!board[row+x][col-x].equals(turn) && !board[row+x][col-x].equals(Piece.EMPTY)){

                        for (int y = 0; y <= i; y++){
                            board[row+y][col-y] = turn;
                        }
                        
                    }
                }
                break;
            }

            if (board[row-i][col+i].equals(turn)){
                for (int x = 1; x < i; x++){
                    if (!board[row-x][col+x].equals(turn) && !board[row-x][col+x].equals(Piece.EMPTY)){

                        for (int y = 0; y <= i; y++){
                            board[row-y][col+y] = turn;
                        }
        

                    }
    
                }
                break;
            }

            break;
        }

        // 4.Change player
        if (turn == Piece.LIGHT){
            turn = Piece.DARK;
        }
        else {
            turn = Piece.LIGHT;
        }
        
        // 5. Continue Playing 
        return Result.GAME_NOT_OVER;
    }
    
    // Brook's Code
    public static void main(String[]args ){
        Othello game = new Othello();
        if (args.length > 0) {
            game.setComputerPlayer(args[0]);
            
        }
        OthelloGUI.showGUI(game);
        System.out.println(game.getBoardString());  
    }
}

    