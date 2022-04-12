/*
input =  [4,1,3] , k = 6
output = 3

input =  [4,1,3] , k = 11
output = 1


*/

/**
 * LastBreadEater
 */
public class LastBreadEater {
    public static void main(String[] args) {
        int[] input = {4,1,3};
        int k = 6;

        int answer = lastBreadEater(input,k);

        System.out.println(answer);
    
    }

    private static int lastBreadEater(int[] input, int k) {
        int length = input.length;
        int i =0;
        while(k>=0){
            k-=input[i];
            if(i==length-1&&k>0){
                i=0;
            }else{
                i++;
            }
        }       
        return i;
    }
    
}