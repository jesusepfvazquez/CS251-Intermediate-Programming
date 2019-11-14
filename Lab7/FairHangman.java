import java.io.*;
import java.util.*;

/**
 * @author Jesus Vazquez
 * Due 11/05/2018
 * 
 */


/**
 * This will implement the HangmanInterface. It will take a txt file and pick a random word, will then play hangman. 
 */
public class FairHangman implements HangmanInterface {
    
    ArrayList<String> mydictionary;
    LinkedList<Character> mylinkedlist;
    Random rand;
    int mynumber;
    String mystring;
    int guesses;
    String myword;

    public FairHangman(String filename) {
        
        System.out.println("You're Playing Fair Hangman");

        // Setting up the ArrayList 
        mydictionary = new ArrayList<String>();    
        
        // Reading in the file
        BufferedReader in = null ;

        try {
            in = new BufferedReader(new FileReader(filename));
            String line = null ;
            while ((line = in.readLine()) != null) {
                mydictionary.add(line);
            }
        } 
        catch(Exception e){
            System.err.println("Dictionary File Not Found");
        }
        // finally {
        //     if(in != null){in.close();}
        // }
        
        //
        rand = new Random();

        // Initializing the game
        initGame(0);


    }

    /** 
     * Initialize a new game. This should reset all the bookkeeping.
     * @param guesses Number of guesses for game.
     */
    public void initGame(int guesses){
        this.guesses = guesses;
        this.myword = mydictionary.get(rand.nextInt(mydictionary.size()) + 1);
        this.mystring = new String(new char[myword.length()]).replace('\0', BLANK);
        this.mylinkedlist = new LinkedList<Character>();
    }

    /**
     * How many guesses left until the player loses?
     * @return number of guesses remaining.
     */
    public int getGuessesRemaining(){
        return guesses;
    }

    /**
     * What letters has the player already guessed?
     * @return Collection of letters guessed so far.
     */
    public Collection<Character> getGuessedLetters(){
        return this.mylinkedlist;
    }

    /**
     * What is the current state of the puzzle? The String will have
     * letters in proper position for correct guesses and blanks for
     * unknowns.
     * @return String representation of the puzzle.
     */
    public String getPuzzle(){
        return this.mystring;
    }

    /**
     * What is the secret word?
     *
     * For a fair game, this the secret word chosen at the beginning
     * of the game.
     *
     * For an evil game, this would be a word that is consistent with
     * the guesses so far.
     *
     * When playing an actual game, this method would only be called
     * when the game is over, but it may be called at any point after
     * the game is initialized for testing purposes.
     *
     * @return The mystery word.
     */
    public String getSecretWord(){
        return this.myword;
    }

    /**
     * Is the guessed puzzle complete? That is, have all the blanks
     * been replaced with letters?
     * @return True if puzzle is completed, false if any blanks remain.
     */
    public boolean isComplete(){
        return !this.mystring.contains("-");
    }

    /**
     * Is the game over? 
     *
     * Game can end when player loses by running out of guesses or
     * when player wins by successfully filling in the puzzle.
     *
     * @return True if game is over, false if not.
     */
    public boolean isGameOver() {
        if(guesses == (0)|!this.mystring.contains("-")){
            return true;
        }
        return false;
    }

    /**
     * Respond to player's guess, updating internal bookkeeping
     * appropriately.
     *
     * @param letter The guessed letter.
     * @param True if letter was found in the word.
     */
    public boolean updateWithGuess(char letter){
        if(mylinkedlist.contains(letter)){
            return true;
        }
        mylinkedlist.add(letter);


        if(!myword.contains(Character.toString(letter))){
            guesses--;
            return false;
        }

        for (int i = 0; i < myword.length(); i++){
            if (myword.charAt(i) == letter){
                char[] mystring_char = mystring.toCharArray();
                mystring_char[i] = letter;
                mystring = String.valueOf(mystring_char);
            }
        }

        return true;
        
    }
}

