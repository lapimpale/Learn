/*
 * You are given a list of player names separated by a comma as a single string.
a. Separate the names
b. print middle name of all the players, if there is no middle name then print "NULL"
Example input:
"Sarah Jane Taylor, Jhulan Nishit Goswami, Katherine Helen Brunt, Meghann Lanning, Mithali Dorai Raj"
Expected output:
Jane
Nishit
Helen
NULL
Dorai
 */

// for(0 - n)
//     String array = split the string " ";
//     if length array 3, then only print array[1];
//     else
//     print null

package JAVA_OOAD_Assignments_2;

public class forthQuestion {
    void printMiddleNames(String[] names) {
        for (String name : names) {
            String[] temp = name.split(" ");
            // if(temp.length==3){
            // System.out.println(temp[1]);
            // }else{
            // System.out.println("NULL");
            // }
            System.out.println(temp.length == 3 ? temp[1] : "NULL");
            ;
        }
    }

    public static void main(String[] args) {
        String[] names = { "Sarah Jane Taylor", "Jhulan Nishit Goswami", "Katherine Helen Brunt", "Meghann Lanning",
                "Mithali Dorai Raj" };

        forthQuestion mref = new forthQuestion();
        mref.printMiddleNames(names);
    }
}

// TC :- O(n) where n is the length given String Array.
// SC:- O(1);

/*
 * 
 * public class Question4 {
 * public static void main(String[] args) {
 * String names =
 * "Sarah Jane Taylor, Jhulan Nishit Goswami, Katherine Helen Brunt, Meghann Lanning, Mithali Dorai Raj"
 * ;
 * System.out.println("names are " + names);
 * String[] array = names.split(",");
 * System.out.println("Total names found:" + array.length);
 * for (String name : array) {
 * System.out.println(name.trim());
 * }
 * 
 * }
 * }
 */