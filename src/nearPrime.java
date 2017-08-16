/**
 * Created by Jack on 8/14/2017.
 */
import javafx.stage.Screen;

import java.util.*;
import java.math.*;


public class nearPrime {
    /*
        determines if the number input to the function is prime
        Input: int in, the number being evaluated as prime
        variables: double rootfl, a variable to track the floor of the square root of the input, which is the max value possible because math
                   boolean ret, the value to be returned indicating whether a number is prime
     */
    public static boolean isPrime(int in){
        double rootfl = Math.floor(Math.sqrt(in));
        boolean ret = true;
        //quick and dirty check for awkward early primes
        if(in == 1 || in == 2) ret = true;
        //loop to check each value up to rootfl for being divisible in in
        for(int i = 2; i <= rootfl; i++) {
            int test = in % i;
            if (in % i == 0) {

                return false;
            }
        }
        return ret;
    }
    /*
        returns the nearest prime number higher than the inputted number
        this is a bad brute force method
        Input: int in, the user inputted number to find the next highest prime number
        variables: double ret, the upper number to be returned
                   int bert, upper limit for where the next highest prime can be found because math
                   Bertrands postulate  if n > 3 is an integer, then there always exists at least one prime number p with n < p < 2n − 2.
     */
    public static double upPrime(int in){
        int bert = 2 * in -2;
        //failing at any other number bert should be returned
        double ret = bert;
        //quick and dirty return for early primes
       switch (in){
           case 1: return 2;
           case 2: return 3;
           case 3: return 5;
       }
        //loop to check each number for primality up to bert, this sucks dont do this ever
        for(int i = in; i <= bert; i++){
           //if a prime number is found we dont want it overwritten so we break out
            if(isPrime(i)){
                ret = i;
                break;
            }
        }
        return ret;
    }
    /*
        Opposite of upPrime, this seems awful but the other ways suck too
        Input: int in, the user inputted number which we will find the next lowest prime
        Variables: double ret, the upper number to be returned
                   double bert, lower limit for where the next highest prime can be found because math
                   Bertrands postulate  if n > 3 is an integer, then there always exists at least one prime number p with n < p < 2n − 2.
                   we are using the opposite n/2+2
     */
    public static double downPrime(int in){
        //we do the floor in case of an odd number
        double bert = Math.floor(in/2)+2;
        //failing at any other number bert should be returned
        double ret = bert;
        if (in == 3){
            return 2;
        }
        //loop to check each number for primality down to bert, this sucks dont do this ever
        for(int i = in; i >= bert; i--){
            //if a prime number is found we dont want it overwritten so we break out
            if(isPrime(i)){
                ret = i;
                break;
            }
        }
        return ret;
    }
    /*
        Main Method, accepts user input and plugs it into the function to calculate the nearest prime, if needed
        Input: String args, standard main method input
        Variables: Scanner scanner, reads user input
                    int number: the number to be tested
     */
    public static void main(String args[]){
        System.out.println("Enter a number");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        if (isPrime(number)){
            System.out.println(number + " is prime.");
        }else System.out.println((int)downPrime(number) + " < " + number + " < " + (int)upPrime(number));
    }
}