/*
 * Given a non-negative int n, return the count of the occurrences of 7 as a digit, so for example 717 yields 2. (no loops). 
 * Note that mod (%) by 10 yields the rightmost digit (126 % 10 is 6), while divide (/) by 10 removes the rightmost digit (126 / 10 is 12).
Example:
count7(717) → 2
count7(7) → 1
count7(123) → 0
 */

package JAVA_OOAD_Assignments_2;

import java.util.Scanner;

public class thirdQuestion {

    static int count7(int n){
        int result = 0;       
        while(n>0){   
            if(n%10 == 7){
                result++;
            }
            n/=10;
        }
        return result;
    }
    //TC = O(digits of N) when N is the given number itself

    //Recursive Approach
    //1) Take all inputs - number, count of 7
    //2) do all your operation - if n<=0 return; 
    //3) 
    static int count7Recursion(int n ){
        if(n<=0){
            return 0;
        }

            if(n%10 == 7){
                return 1 + count7Recursion(n/10);
            }
            return count7Recursion(n/10);
    }



    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        sc.close();
        System.out.println(count7(number));
        System.out.println(count7Recursion(number));
    }
    
}
