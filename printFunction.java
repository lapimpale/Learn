import java.util.Scanner;

public class printFunction {

    public static void main(String[] args) {
        

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();

        printRecursively(1, n);
    }

    private static void printRecursively(int i, int n) {
        if(i > n){
            return;
        }
        
        System.out.println(i);

        printRecursively(i+1, n);
    }
    
}
