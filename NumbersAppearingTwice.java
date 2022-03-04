import java.util.ArrayList;
import java.util.HashMap;

/*
Problem Statement 1:
Given an integer array data of size arr_size where the minimum size of array is 1. Each integer appears once or twice. Write a function which will return an array of all the integers that appear twice. Ignore the integer if it appears three or more number of times.

Example1: data = [10, 12, 10, 11, 13, 17, 16, 15, 11] 
output = [10, 11]

Example 2: data = [7, 3, 8, 6, 4, 6, 7, 8, 9, 8, 7] 
output = [6]

*/


public class NumbersAppearingTwice {
    public static void main(String[] args) {
        int[] data = {10, 12, 10, 11, 13, 17, 16, 15, 11};
        //int[] data = {7, 3, 8, 6, 4, 6, 7, 8, 9, 8, 7};

        //initializing ArrayList to store the result;
        ArrayList<Integer>numbersAppearingTwice = new ArrayList<Integer>();
        
        //Initializing HashMap to store the frequency of all elements in the Array
        HashMap<Integer,Integer> map = new HashMap<>();

        for(int i = 0; i< data.length;i++){
            //check if the element is already added as Key in HashMap
            if(map.containsKey(data[i])){
                //if true, then increase the frequecy by 1
                map.put(data[i], map.get(data[i])+1);
            }else{
                //if the element is not present in the HashMap then add the element with 1 value;
                map.put(data[i], 1);
            }
        }

        //iterating through all the keys in the HashMap
        for(Integer i : map.keySet()){
            //checking if any element has frequency 2 as per our requirement;
            if(map.get(i)==2){
                //adding the element to our answer list
                numbersAppearingTwice.add(i);
            }
        }

        System.out.println(numbersAppearingTwice);
    }
}
