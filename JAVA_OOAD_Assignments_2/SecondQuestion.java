package JAVA_OOAD_Assignments_2;

import java.util.Scanner;

/*
 * 
 * Write a method which takes source, destination, distance and type of cab as input, duration of trip 
 * and returns the fare to be paid. Your method should use combination of 
 * if/else statements internally
 * 
 */
public class SecondQuestion {

    static void calculateFare(String source, String destination, int distance, String cabType, int duration){
        int fairToPaid = 0;
        int sedan = 10;
        int hatchback = 5;
        int auto = 3;

        if(distance <= 10 ){
            if(cabType.contains("Sedan")){
                System.out.println("I am travelling through Sedan");
                fairToPaid += distance*sedan;
            } else if(cabType.contains("Hatchback")){
                fairToPaid += distance*hatchback;
            } else if(cabType.contains( "Auto")){
                fairToPaid += distance*auto;
            }
            if(duration <=10){
                //do nothing
            } else {
                fairToPaid += (duration-10)*3;
                //adding 10 Rs extra for extra duration.
            }
        } else if(distance <= 20){
            if(cabType.contains("Sedan")){
                fairToPaid += distance*sedan + (distance - 10) * 3;
            } else if(cabType.contains("Hatchback")){
                fairToPaid += distance*hatchback + (distance - 10) * 3;
            } else if(cabType.contains("Auto")){
                fairToPaid += distance*auto + (distance - 10) * 3;
            }

            if(duration <=20){
                //do nothing
            } else {
                fairToPaid += (duration-20)*3;
                //adding 10 Rs extra for extra duration.
            }
        } else {System.out.println("Outside city limits");}

        System.out.println("please pay" + '\u20b9' + fairToPaid);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("please enter the source");
        String source = sc.nextLine();
        System.out.println("please enter the destination");
        String destination = sc.nextLine();
        System.out.println("please enter the distance");
        int distance = sc.nextInt();
        sc.nextLine();
        System.out.println("please enter the Cab Type");
        String cabType = sc.nextLine();
        System.out.println("please enter the Duration");
        int duration = sc.nextInt();

        calculateFare(source, destination, distance, cabType, duration);
        sc.close();
    }
}
