import java.util.*;
 
// Program to count the frequency of the elements in a list
class Main
{
    public static void main(String[] args)
    {
        List<String> list = new ArrayList<>();
        list.add("Apple");
        list.add("Samsung");
        list.add("Nokia");
        list.add("OnePlus");
        list.add("OnePlus");
        list.add("Apple");
        list.add("Apple");
        list.add("OnePlus");
        list.add("Nokia");
        list.add("Redmi");
        list.add("Xiomi");
        list.add("HTC");
        list.add("Sony");
        list.add("LG");
        list.add("Apple");
        

        int max = 0;
        int curr = 0;
        String currKey =  null;
        Set<String> distinct = new HashSet<>(list);
        for (String s: distinct) {
            curr = Collections.frequency(list, s);
            if(max < curr){
                max = curr;
                currKey = s;
            }
        }

        System.out.println("Max occured String is " + currKey +" and occured "+max+" times." );
    }
}