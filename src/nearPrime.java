/**
 * Created by Jack on 8/14/2017.
 */
import java.util.*;
import java.math.*;


public class nearPrime {
    /*
        determines if the number input to the function is prime
        Input: int in, the number being evaluated as prime
        variables: double rootfl, a variable to track the floor of the square root of the input, which is the max value possible because math
                   boolean ret, the value to be returned indicating whether a number is prime
     */
    public boolean isPrime(int in){
        double rootfl = Math.floor(Math.sqrt(in));
        boolean ret = false;
        //quick and dirty check for awkward early primes
        if(in == 1 || in == 2){
            ret = true;
        }
        //loop to check each value up to rootfl for being divisible in in
        for(int i = 0; i <= rootfl || ret == true; i++) {
            if (in % i == 0) {
                ret = true;
            }
        }
        return ret;
    }
    /*
        returns the nearest prime number higher than the inputted number
        this is a bad brute force method
        variables: double ret, the upper number to be returned
                   int bert, upper limit for where the next highest prime can be found because math
                   Bertrands postulate  if n > 3 is an integer, then there always exists at least one prime number p with n < p < 2n − 2.
     */
    public double upPrime(int in){
        double ret = 0;
        int bert
        //
    }
    /*
        Main Method, accepts user input and plugs it into the function to calculate the nearest prime, if needed
     */
    public static void main(String args[]){
        system.out.println("Enter a number");

    }
}
