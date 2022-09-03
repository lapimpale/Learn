package JAVA_OOAD_Assignments_2;

import java.util.Scanner;

public class ClassRoomQuestion {
    public static void main(String[] args) {
        int[][] chessBoard = new int[8][8];

        Scanner sc = new Scanner(System.in);

        System.out.println("enter the column no to place the 1st Queen");
        int firstQueenColumn = sc.nextInt();
        System.out.println("enter the row no to place the 1st Queen");
        int firstQueenRow = sc.nextInt();

        chessBoard[firstQueenColumn][firstQueenRow] = 1;

        System.out.println("enter the column no to place the 2nd Queen");
        int secondQueenColumn = sc.nextInt();
        System.out.println("enter the row no to place the 2nd Queen");
        int secondQueenRow = sc.nextInt();
        chessBoard[secondQueenColumn][secondQueenRow] = 1;
        
        for(int colIdx = 0; colIdx <8;colIdx++){
            int temp = 0;
            for(int rowIdx = 0; rowIdx < 8; rowIdx++){
                temp+=chessBoard[colIdx][rowIdx];
            }
            if(temp>=2){
                System.out.println("2nd Queen is not safe");
            }
        }
        sc.close();
    }
}
