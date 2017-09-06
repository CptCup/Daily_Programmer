package reverse_scrabble;

/**
 * Created by Jack on 8/16/2017.
 * finds scrabble score in reverse
 * global variable: list diction, word dictionary to be used
 *                  Scanner scanWords, this will contain our txt file of words
 */
import java.awt.*;
import java.util.*;

public class reverseScrabble {
    ArrayList<String> diction = new ArrayList<String>();
    ArrayList<scrabWord> playedWords = new ArrayList<scrabWord>();
    Scanner scanWords = new Scanner("enable1.txt");

    /**
     * Method to populate a list of words that we could possible have on our scrabble board
     * @return
     */
    public ArrayList<String> populateScanwords(){
        while (scanWords.hasNextLine()){
            diction.add(scanWords.nextLine());
        }
        scanWords.close();
        return diction;
    }
    public ArrayList<scrabWord> findWords(char[][] inBoard, int length, int height){
        //A temporary variables to keep track of a potential word's string direction and starting point
        String curWord = "";
        boolean curDirect;
        Point curPoint;
        //nested for loop to go through the whole board
        for(int i = 0; i < length; i++){
            for(int j = 0; j < height; i++){
                //beginning of checking and building a new word
                if (inBoard[i][j] != '.'){
                    curPoint = new Point(i,j);
                    if (i+1 < length && i+1 != '.'){
                        //variable so we can iterate from i without changing i
                        int count = i;
                        curDirect = true;
                        while(count+1 < length && inBoard[count][j]!= '.'){
                            curWord += inBoard[count][j];
                            if(diction.contains(curWord) && !(playedWords.contains(curWord))){
                                playedWords.add(new scrabWord(curPoint,curDirect,curWord));
                            }
                            count++;
                        }
                    }
                }
            }
        }
        return null;
    }

}
