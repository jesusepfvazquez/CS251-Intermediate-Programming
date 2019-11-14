import java.io.*;
import java.util.*;

/**
 * @author Jesus Vazquez
 * Due 11/05/2018
 * 
 */

 /**
 * This will implement the HangmanInterface. It will take a txt file and pick a random word, will then 
 * play evil hangman. 
 */
public class EvilHangman extends FairHangman {

    ArrayList<String> mywords;
    ArrayList<String> mydictionary;
    HashMap<Integer, ArrayList<String>> nWords;
    LinkedList<Character> mylinkedlist;
    String puzzle;

    public EvilHangman(String filename) {
        super(filename);
        System.out.println("You're Playing Evil Hangman");
    }

    /** 
     * Initialize a new game. This should reset all the bookkeeping.
     * @param guesses Number of guesses for game.
     */
    public void initGame(int guesses){
        
        this.guesses = guesses;
        this.mylinkedlist = new LinkedList<Character>();
        nWords = new HashMap<Integer, ArrayList<String>>();
        
        // Mapping words into evil dictionary

        for (String key: mydictionary){
            int keylength = key.length();
            nWords.putIfAbsent(keylength, new ArrayList<String>());
            nWords.get(keylength).add(key);
        }

        // Choosing the list with the highest number 
        int sizeVar = -10;
        int bestkey = -10;

        for (int key: nWords.keySet()){
            int sizewords = nWords.get(key).size();
            if (sizewords > sizeVar){
                sizeVar = sizewords;
                bestkey = key;
            }
        }

        ArrayList<String> mydictionary = nWords.get(bestkey);
        this.mystring = new String(new char[bestkey]).replace('\0', BLANK);

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
        
        for (String key: mydictionary){
            for (int i = 0; i < myword.length(); i++){
                if (mystring.charAt(i) != BLANK){
                    if (key.charAt(i) != (mystring.charAt(i))){
                        mydictionary.remove(key);
                    }
                }
            }
        }
   
       this.myword = mydictionary.get(rand.nextInt(mydictionary.size()) + 1);
       return this.myword;
   
    }
   
}
    

    

