/*
 input = peEeemsoke;
 output = peemsoke;



 input = aAbBcC;
 output = "";
*/

public class NiceString {
    public static void main(String[] args) {
        String s= "aAbBcC";
        String answer = niceString(s);

        System.out.println(answer);
    }

    private static String niceString(String s) {
        String niceString = "";
        int length = s.length();

        for(int i = 0; i < length;i++){
            int c = s.charAt(i) - 'a';
            if (c > 0){
                niceString+=s.charAt(i);
            } else{
                if(niceString.length()!=0){
                    niceString = niceString.substring(0, niceString.length()-1);
                }
            }
        }

        return niceString;
    }
}
