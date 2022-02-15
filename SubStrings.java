/*
Given a string s consisting only of characters a, b and c.
Return the number of substrings containing at least one occurrence of all these characters a, b and c.

Input: s = "aaacb"
Output: 3
Explanation: "aaacb", "aacb" and "acb".

Input: s = "abc"
Output: 1

*/


public class SubStrings {
    public static void main(String[] args) {
        int count = 0;
        String s = "abcdef";
        int n = s.length();
        for(int i = 0; i< n ;i++){
            for(int j = n;j>i;j--){
                if(s.substring(i,j).contains("a")&&s.substring(i,j).contains("b")&&s.substring(i,j).contains("c")){
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}
