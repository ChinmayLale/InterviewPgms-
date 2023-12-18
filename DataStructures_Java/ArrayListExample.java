import java.util.*;
public class ArrayListExample {
    public static void main(String[] args) {
        //  Integer | Float | String
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(1);
        list.add(9);
        list.add(5);
        list.add(7);
        System.out.println(list); 
        System.out.println("Adding 6 at index 2");
        list.add(2,6);
        System.out.println(list);
        System.out.println("Element at index 3 is : "+list.get(3));
        System.out.println("Size of list is : "+list.size());
        System.out.println("Setting 0 to 4th index");
        list.set(4,0);
        System.out.println(list);
    }
}
