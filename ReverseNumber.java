import java.util.Scanner;

public class ReverseNumber{

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        in.close();
        int sol = 0;
        while(n!=0){
            int rem = n%10;

            sol = sol * 10 + rem;

            n/=10;

        }

        System.out.println(sol);
    }
}