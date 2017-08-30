package reverse_scrabble;
import java.awt.*;
import java.lang.Object;
/**
 * Created by Jack on 8/30/2017.
 * object designed to hold pertinent data to a word in scrabble when finding the words in a scrabble board
 * Global variables: Point startPos, x y coordinates representing the start position of the word
 *                   boolean direction, indicates the direction the word is written, true word goes left to right false
 *                                      up to down
 *                   String wordString, the actual word that was played in the "Scrabble" game
 */
public class scrabWord {
    public Point startPos = new Point(0,0);
    public boolean direction = true;
    public String wordString = "";

    /**
     * This is just the constructor, nothing special here
     * @param inPoint, user input point where x y coordinates representing the start position of the word
     * @param inBool, boolean direction, indicates the direction the word is written, true word goes left to right false
     *                up to down
     * @param inString, the actual word that was played in the "Scrabble" game
     */
    public scrabWord(Point inPoint, boolean inBool, String inString){
        Point constructorPoint = inPoint;
        boolean constructorBool = inBool;
        String constructorString = inString;
    }

    /**
     * Mutator for our starting position
     * @param newPos, user input position to be changed to
     */
    public void setStartPos(Point newPos){
        this.startPos = newPos;
    }

    /**
     * Mutator for our direction
     * @param newDirection, change the boolean indicating the word's traveling direction
     */
    public void setDirection(boolean newDirection){
        this.direction = newDirection;
    }

    /**
     * Mutator for the text String
     * @param inString
     */
    public void setWordString(String inString){
        this.wordString = inString;
    }

    /**
     * Acessor method for the word's starting position
     * @return returns the current point indicating start position
     */
    public Point getStartPos(){
        return this.startPos;
    }

    /**
     * Accessor for the word's direction
     * @return returns the boolean representing the word's direction
     */
    public boolean getDirection(){
        return this.direction;
    }

    /**
     * Acessor for the word's text string
     * @return returns the string
     */
    public String getWordString() {
        return wordString;
    }
    @Override
    public boolean equals(Object otherPoint){
        return false;
    }
}
