import java.util.Scanner;

/*

Find maximum height to cut all chocolates horizontally such that at least K amount remains
Given an array arr[] consisting of heights of N chocolate bars, the task is to find the maximum height at which the horizontal cut is made to all the chocolates such that the sum remaining amount of chocolate is at least K.
Input: K = 7, arr[] = [15, 20, 8, 17]
Output: 15
Explanation:
If a cut is made at height 8 the total chocolate removed is 24 and chocolate wasted is 24 – 7 = 17 units. If a cut is made at height 15 then chocolate removed is 7 and no chocolate is wasted. Therefore 15 is the answer.

*/


public class MaxHt2Cut {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i =0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        sc.close();
    }
}
