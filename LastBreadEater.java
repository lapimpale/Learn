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
        int answer2 = lastBreadEater2(input,k);

        System.out.println(answer);
        System.out.println(answer2);
    
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

    public static int lastBreadEater2(int[] breads, int k) {
            long sum = 0;
            for (int bread : breads) {
                sum += bread; 
            }
            k = (int)((long)k % sum);
            int count = 0;
            while (k > 0) {
                k -= breads[count++];
            }
            return k == 0 ? count : count - 1;
        
    }
    
}