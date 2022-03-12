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
public class RiverSizes{
    public static void main(String[] args) {

        int[][] map = {{0, 0, 0, 0, 1},
                        {1, 1, 0, 0, 0},
                        {1, 0, 0, 0, 1},
                        {1, 0, 0, 1, 1}
    };
        int m = map.length;
        int n = map[0].length;

        List<Integer> riverSizesList = new ArrayList<Integer>();
        for(int i =0;i<m;i++){
            for(int j = 0; j< n;j++){
                if(map[i][j]==1){
                    riverSizesList.add(riverSize(map,i,j));
                }
            }
        }
        System.out.println(LongestRiverList);
    }

    public static int riverSize(int[][] map,int i, int j){
        if(i<0 || j<0 || i>=map.length || j>=map[0].length || map[i][j]==0 ){
            return 0;
        }

        map[i][j]=0;
        
        int count = 1;

        count += riverSize(map, i , j+1) + riverSize(map, i+1 , j ) + riverSize(map, i-1, j ) + riverSize(map, i, j-1);

         return count;
    }
}