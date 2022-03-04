/*
You are given a 2D array of potentially unequal width and height. 0 in the matrix represent land, 
1 in the matrix represent water. Write a function which returns the lengths of unique rivers.

0, 0, 0, 1
1, 1, 0, 0,
1, 0, 0, 1,
1, 0, 0, 1

returns [1, 4, 2]

0, 0, 0, 1, 1,
1, 1, 0, 0, 1,
0, 0, 0, 1, 1,
0, 0, 0, 1, 0

returns [6, 2]
*/
import java.util.*;
public class LongestRiver {
    public static void main(String[] args) {

        int[][] map = {{0, 0, 0, 1, 1},
                        {1, 1, 0, 0, 1},
                        {0, 0, 0, 1, 1},
                        {0, 0, 0, 1, 0}
    };
        int m = map.length;
        int n = map[0].length;

        List<Integer> LongestRiverList = new ArrayList<Integer>();
        for(int i =0;i<m;i++){
            for(int j = 0; j< n;j++){
                if(map[i][j]==1){
                    LongestRiverList.add(longestRiver(map,i,j));
                }
            }
        }

        // for(int i =0;i<m;i++){
        //     for(int j = 0; j< n;j++){
        //         System.out.print(map[i][j] + " ");
        //     }
        //     System.out.println("");
        // }

        System.out.println(LongestRiverList);

    }

    public static int longestRiver(int[][] map,int i, int j){
        if(i<0 || j<0 || i>=map.length || j>=map[0].length ){
            return 1;
        }

        if(map[i][j]==0) return 0;

        map[i][j]=0;      

        return longestRiver(map, i - 1, j) + longestRiver(map, i , j -1) + longestRiver(map, i, j + 1) + longestRiver(map, i + 1, j);
    }
}
