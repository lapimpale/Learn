public class ReverseNumber{

    public static void main(String[] args) {
        int n = 543453;
        int sol = 0;
        while(n!=0){
            int rem = n%10;

            sol+=rem;

            n/=10;

        }

        System.out.println(sol);
    }
}