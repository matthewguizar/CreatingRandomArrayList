import java.util.ArrayList;
import java.util.Arrays;


public class Main{
    public static void main(String[] args){
        System.out.println(FindLuckyNumbers(4));
    }

    public static ArrayList<Integer> FindLuckyNumbers(int n){
        /*creating an two array lists one to hold the only 1-10
        the second will be empty and going to be filled in later
         */
       ArrayList<Integer> possibleNumbers = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9,10));
       ArrayList<Integer> luckyNumbers = new ArrayList<>();

       /*
        * creating a loop thats going to run as much as the argument passed in (n times)
        */
       for (int i = 0; i < n; i++) {
        /*creating a random number from the length or size of possibleNumbers (10)
        so essentially getting a random number 1-10. 
        Math.floor rounds it to the nearest whole number but makes it a double
        so I cast it to an int
        */
        int x = (int)Math.floor(Math.random() * possibleNumbers.size());
        /* adding the random number to luckyNumbers
         * since the loop runs the amount of n-times it will keep adding numbers based on the argument passed in.
         */
        luckyNumbers.add(x);
        
       }
       return luckyNumbers;
    
    }
}