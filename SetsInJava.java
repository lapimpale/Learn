import java.util.HashSet;
import java.util.Set;

public class SetsInJava {
    public static void main(String[] args) {

        // int[] arr = {1,2,3,4,5,6,3,4,5,2};

        // for(int i : arr){
        // System.out.println(i);
        // }

        Set<Integer> mySet = new HashSet<Integer>();

        // how to add the elements
        mySet.add(1);
        mySet.add(2);
        mySet.add(3);
        mySet.add(4);
        mySet.add(5);
        mySet.add(6);

        // System.out.println(mySet);

        // mySet.add(2);
        // System.out.println("After adding one more element"+ mySet);

        // mySet.remove(4);

        // System.out.println(mySet);

        // boolean isMySetEmpty = mySet.isEmpty();
        // System.out.println(isMySetEmpty);

        // Iterate in a Set

        // First Method

        // for(int i : mySet){
        // System.out.println(i);
        // }

        // Second Method

        // Iterator it = mySet.iterator();

        // while(it.hasNext()){
        // System.out.println(it.next());
        // }

    }
}
