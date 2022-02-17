import java.util.Scanner;
/*
Time limit: 1.00 s Memory limit: 512 MB
Consider an algorithm that takes as input a positive integer n. If n is even, the algorithm divides it by two, and if n is odd, the algorithm multiplies it by three and adds one. The algorithm repeats this, until n is one. For example, the sequence for n=3 is as follows:
3→10→5→16→8→4→2→1

Your task is to simulate the execution of the algorithm for a given value of n.

Input

The only input line contains an integer n.

Output

Print a line that contains all values of n during the algorithm.

Constraints
1≤n≤106
Example

Input:
3

Output:
3 10 5 16 8 4 2 1

*/



public class WeirdAlgorithm {
    static void fun(long n){
        if(n==1){
            System.out.print(1+" ");
            return;
        }
        else{
            System.out.print(n+" ");
            if(n%2==1){
                fun(3*n+1);
            }
            else{
                fun(n/2);
            }
        }
    }
        public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        long n=s.nextLong();
        fun(n);
    }
}
