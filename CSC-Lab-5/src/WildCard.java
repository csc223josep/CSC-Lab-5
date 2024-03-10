import java.util.Arrays;
import java.util.List;

/**
 * Wildcard class to demonstrate generics in Java
 * 
 * @author Joseph Kabesha 
 * @author Isaiah Ayres
 * @author Dan Obrien
 */
public class WildCard {
    // Generic method to print elements of any type List
    public static void printList(List<?> list) {
        for (Object elem : list) {
            System.out.println(elem);
        }
    }

    public static void main(String[] args) {
        // Creating Lists of different types
        List<Integer> integerList = Arrays.asList(1, 2, 3, 4, 5);
        List<String> stringList = Arrays.asList("Hello", "World", "Java");

        // Printing elements of Integer List
        System.out.println("Integer List:");
        printList(integerList);

        // Printing elements of String List
        System.out.println("\nString List:");
        printList(stringList);
    }
}
