import java.util.HashMap;

public class FindUnique {

    public static int findUniqueElementWithNoOccurence(int[] array) {

        // //xor Approach
        // int element = 0;

        // for (int x : array)
        // element ^= x;

        // return element == 0 ? -1 : element;

        int element = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        for (Integer a : array) {
            map.put(a, map.getOrDefault(a, 0) + 1);
        }

        for (Integer i : map.keySet()) {
            if (map.get(i) == 1) {
                element = i;
            }
        }

        return element;
    }

    public static void main(String[] args) {

        // The Array Here has pair of numbers but 3 is kind of unique which has no pair
        // :)
        int[] array = { 9, 8, 1, 5, 1, 1, 9, 8, 5, 3, 1 };

        System.out.println(findUniqueElementWithNoOccurence(array));

    }

}