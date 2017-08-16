package reverse_scrabble;

/**
 * Created by Jack on 8/16/2017.
 * finds scrabble score in reverse
 * global variable: list diction, word dictionary to be used
 */
import java.util.*;

public class reverseScrabble {
    ArrayList<String> diction = new ArrayList<String>();
    Scanner scanWords = new Scanner("enable1.txt");
    /*
        method to populate our dictionary of scrabble words
     */
    public ArrayList<String> populateScanwords(){
        while (scanWords.hasNextLine()){
            diction.add(scanWords.nextLine());
        }
        scanWords.close();
        return diction;
    }
    /*
        Finds all of the words in the board
     */
    public ArrayList<String> getWords(char[][] in){

    }

}
