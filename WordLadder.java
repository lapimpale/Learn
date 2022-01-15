import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class WordLadder {
    public static int ladderLength(String beginWord, String endWord, List<String> wordList) {
        Queue<String> queue = new LinkedList<>();
        // converting to set as set remove() takes O(1) time while list remove() takes O(n)
        HashSet<String> dict = new HashSet<>(wordList);
        if(!dict.contains(endWord)){
            return 0;
        }
        if(beginWord.equals(endWord)){
            return 1;
        }
        
        queue.add(beginWord);
        int count = 1; // 1 for beginWord
        while(queue.size()>0){
            int size = queue.size();
            // for all words at current level
            for(int i=0; i<size; i++){
                char[] word = queue.poll().toCharArray();
                // we will replace each char one by one with [a,z] and check if it exists in our dictionary
                for(int j=0; j<word.length; j++){
                    char tmp = word[j];
                    for(char c='a'; c<='z'; c++){
                        word[j] = c;
                        String newWord = new String(word); // next word after replacing jth character
                        if(dict.contains(newWord)){
                            if(newWord.equals(endWord)){
                                return count + 1;
                            }
                            queue.add(newWord);
                            dict.remove(newWord);
                        }
                    }
                    word[j] = tmp; // resetting to actual word for next iteration of inner for loop.
                }
            }
            // we have checked for all next words reachable from current queue, Hence
            count += 1; 
        }
        // reaching here means we have not found endWord, yet return 0
        return 0;
    }
    
    /*
    Time Complexity: N is size of dictionary, M is say length of each word
    O(N) - to iterate over each word of dictionary
    O(M) - to convert word to char array
    O(M) - looping for each char
    26 - to reach each possible word from a word
    O(M) - to convert charArray to String
    O(M) - to compare two words
    Inner for loop --> O(M)*26* (O(M) + O(M)) --> O(M^2)
    Time Complexity including outer-inner for loop --> O(N) * ( O(M)+O(M^2) )
    Final Time Complexity - O(N*M^2)
    */

    //driver code
    public static void main(String[] args) {
        String beginWord = "hit", endWord = "cog";
        List<String> wordList = new ArrayList<>();
        wordList.add("hot");
        wordList.add("dot");
        wordList.add("dog");
        wordList.add("lot");
        wordList.add("log");
        wordList.add("cog");
        
        int ans = ladderLength(beginWord,endWord, wordList);
        System.out.println(ans);
    }
}
