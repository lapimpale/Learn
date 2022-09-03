import java.util.Arrays;

/*
Amazon Prime Video is a subscription video-on demand over-the-top streaming and rental service. The team at Prime Video is developing a method to divide movies into groups based on the number of awards they have won. A group can consist of any number of movies, but the difference in the number of awards won by any two movies in the group must not exceed k.

The movies can be grouped together irrespective of their initial order. Determine the minimum number of groups that can be formed such that each movie is in exactly one group.

Example

The numbers of awards per movie are awards = [1, 5, 4, 6, 8, 9, 2], and the maximum allowed difference is k = 3.

One way to divide the movies into the minimum
number of groups is:3

The first group can contain [2, 1]. The maximum difference between awards of any two movies is 1 which does not exceed k.
The second group can contain [5, 4, 6]. The maximum difference between awards of any two movies is 2 which does not exceed k.
The third group can contain [8, 9]. The maximum difference between awards of any two movies is 1 which does not exceed k.
The movies can be divided into a minimum of 3 groups.

*/

public class AmazonAwards {

    public static void main(String[] args) {
        int [] awards = {1, 5, 4, 6, 8, 9, 2};
        int k = 3;
        int N = 7;

        int [] awards2 = {1, 13, 6, 8, 9, 3,5};
        int k2 = 4;
        N = awards2.length;

        System.out.println(groupAwards(awards,k,N));
        System.out.println(groupAwards(awards2,k2,N));
    }

    static int groupAwards(int[] awards, int k, int N) {
        Arrays.sort(awards);
        if (awards == null || awards.length == 0 || k < 0)   return 0;
        int pairCount = 0; int idx=0;
        for(int i = 0; i<N;i++){
            if(awards[i] - awards[idx] > k){
                pairCount++;
                idx = i;
            }
        }
        return pairCount+1;
    }
}
