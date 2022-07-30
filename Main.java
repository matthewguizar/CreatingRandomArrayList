import java.util.ArrayList;
import java.util.Arrays;


public class Main{
    public static void main(String[] args){
        System.out.println(FindLuckyNumbers(4));
    }

    public static ArrayList<Integer> FindLuckyNumbers(int n){
       ArrayList<Integer> possibleNumbers = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9,10));
       ArrayList<Integer> luckyNumbers = new ArrayList<>();

       for (int i = 0; i < n; i++) {
        int x = (int)Math.floor(Math.random() * possibleNumbers.size());
        luckyNumbers.add(x);
        
       }
       return luckyNumbers;
    
    }
}