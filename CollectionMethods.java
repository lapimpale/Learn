import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionMethods {
    public static void main(String[] args) {
        List<Integer> myList = new ArrayList<Integer>();
        myList.add(1);
        myList.add(2);
        myList.add(6);
        myList.add(4);
        myList.add(5);
        myList.add(3);
        myList.add(7);
        myList.add(8);
        myList.add(12);
        myList.add(10);
        myList.add(11);
        myList.add(9);

        System.out.println(myList);

        Collections.sort(myList);

        System.out.println(myList);

        int minElement = Collections.min(myList);
        int maxElement = Collections.max(myList);

        System.out.println("minimum of the list is " + minElement);
        System.out.println("maximum of the list is " + maxElement);

        Collections.shuffle(myList);

        System.out.println(myList);

        int a = Collections.binarySearch(myList, 10);
        System.out.println(a);

    }

}
