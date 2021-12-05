import java.util.*;

public class Array {
    public static void main(String args[]) {
        Scanner sc = new Scanner (System.in);
        String email = sc.nextLine();
        String userName = "";
    
        for(int i=0; i<email.length(); i++) {
          if(email.charAt(i) == '@') {
           break;
          } else {
            userName += email.charAt(i);
          }
        }
    
        System.out.println(userName);
      }
   
}
