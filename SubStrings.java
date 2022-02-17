/*
Given a string s consisting only of characters a, b and c.
Return the number of substrings containing at least one occurrence of all these characters a, b and c.

Input: s = "aaacb"
Output: 3
Explanation: "aaacb", "aacb" and "acb".

Input: s = "abc"
Output: 1

*/

import java.util.*;
public class SubStrings {
    public static void main(String[] args) {
        int count = 0;
        String s = "abcdef";
        int n = s.length();
        for(int i = 0; i< n ;i++){
            for(int j = n;j>i;j--){
                if(s.substring(i,j).contains("a")&&s.substring(i,j).contains("b")&&s.substring(i,j).contains("c")){
                    System.out.println(s.substring(i,j));
                    count++;
                }
            }
        }
        System.out.println(count);
        ArrayList<String> ans = new ArrayList<String>();
        recursion(s, ans);
        System.out.println(ans);
        System.out.println(ans.size());
    }

    static void recursion(String s, ArrayList<String> ans){
            if(s.length()<2){
                return;
            }

            if(s.contains("a")&&s.contains("b")&&s.contains("c")){
                ans.add(s);
            }

            recursion(s.substring(1), ans);
            recursion(s.substring(0,s.length()-1), ans);
        }
}
