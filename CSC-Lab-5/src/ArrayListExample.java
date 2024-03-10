import java.util.ArrayList;

/**
 * ArrayList example class to demonstrate ArrayList in Java.
 * 
 * @author Joseph Kabesha 
 * @author Isaiah Ayres
 * @author Dan Obrien
 */
public class ArrayListExample {
    public static void main(String[] args) {
        // Creating an ArrayList to store names
        ArrayList<String> names = new ArrayList<>();

        // Adding elements to the ArrayList
        names.add("John");
        names.add("Jane");
        names.add("Doe");

        // Printing all elements in the list
        System.out.println("Names in the list:");
        for (String name : names) {
            System.out.println(name);
        }

        // Removing the element at index 2 (Doe)
        names.remove(2);

        // Adding a new element to the ArrayList
        names.add("Smith");

        // Printing all elements after modifications
        System.out.println("\nNames in the list after modifications:");
        for (String name : names) {
            System.out.println(name);
        }

        // Accessing elements using the get() method
        System.out.println("\nFirst name in the list: " + names.get(0));
    }
}