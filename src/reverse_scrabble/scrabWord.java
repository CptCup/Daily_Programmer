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

    /**
     * tests for equality in the way we care about, if they are the same type, same string and travel in the same
     * direction from the same start point then they are equal
     * @param otherPoint the thing we are checking for equality
     * @return a boolean indicating true if the two things are the same, false if they are not the same
     */
    @Override
    public boolean equals(Object otherPoint){
        //if otherPoint is not a scrabWord it cant be equal to another for our purposes
        if (!(otherPoint instanceof scrabWord)){
            return false;
        /* ugly conditional, in The King's, if the length of the string contained in this object is not the same as the
            the string it is being compared to, they cannot be the same scrabWord
         */
        }else if(!(this.wordString.equals(((scrabWord) otherPoint).getWordString()))){
            return false;
        }else if (!(this.getDirection()))
        //if otherPoint doesnt fail any of our checks for equality, they must be equal
        return true;
    }
}
