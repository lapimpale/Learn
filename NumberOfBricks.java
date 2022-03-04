import java.util.Scanner;

/*
Problem Statement 2: 

John (1) and Jack (2), are friends who construct the wall as per the number of bricks given to them.
They work turn by turn. John works in the increasing order starting from 1 with an increment of 1. Jack places twice the bricks as John places in previous turn. Goal is to find who placed the last brick and how many bricks will be placed in the end.


Example 1:
numberOfBricks: 13
John & Jack will construct the wall
John 1
Total Bricks till now: 1
Jack 1*2
Total Bricks till now: 3
John 2
Total Bricks till now: 5
Jack 2*2
Total Bricks till now: 9
John 3
Total Bricks till now: 12
Jack 3*2
Total Bricks till now: 18
Since total bricks to be placed were 13. But lastly sum became 18, hence lastly Jack has to place on 1 more brick. The correct answer in result array is:
result[0] = 2 // as Jack placed the last brick
result[1] = 1 // only 1 brick was to be placed in the end


Example 2:
numberOfBricks: 10
John & Jack will construct the wall
John 1
Total Bricks till now: 1
Jack 1*2
Total Bricks till now: 3
John 2
Total Bricks till now: 5
Jack 2*2
Total Bricks till now: 9
John 3
Total Bricks till now: 12
Since total bricks to be placed were 10. But lastly sum became 12, hence lastly John has to place on 1 more brick. The correct answer in result array is:
result[0] = 1 // as John placed the last brick
result[1] = 1 // only 1 brick was to be placed in the end"
*/

public class NumberOfBricks {
    public static void main(String[] args) {
        //initializing scanner to take input for the number of Bricks
        Scanner sc = new Scanner(System.in);
        int numberOfBricks=sc.nextInt();
        sc.close();

        //initializing values for John and Jack for easy understanding and winner so than we can assign jack or john to winner.
        int x = 1; int john = 1,jack = 2;
        int winner = 0;

        //Running a while loop until we are out of stock for the bricks
        while(numberOfBricks>=0){
            //Subtracting the number of bricks used by john at x'th time
            numberOfBricks -= x;
            //checking whether we are out of stock after john used the bricks at x'th time.
            if(numberOfBricks<=x) {
                winner = john; //Declaring John as winner because he placed the last brick.
                //numberOfBricks += x; //adding the number of bricks used at x'th time, which caused us shortage of the bricks.
                break; //as we are satisfied with our results, breaking out of loop.
            }

            numberOfBricks -= 2*x; //Subtracting the number of bricks used by jack at x'th time, the number of bricks used by jack is double of john hence 2 * x.
            if(numberOfBricks<=2*x) {
                winner = jack; //Declaring Jack as winner because he placed the last brick.
                //numberOfBricks += 2*x; //adding the number of bricks used at x'th time, which caused us shortage of the bricks.
                break; //as we are satisfied with our results, breaking out of loop.
            }
            x++; // incrementing x by 1 in each loop.
        }

        System.out.println(winner +" "+ numberOfBricks);
    }
}
