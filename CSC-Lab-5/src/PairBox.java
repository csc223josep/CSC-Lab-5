import java.util.Scanner;

/**
 * Pair box class to demonstrate generics in Java
 * 
 * @author Joseph Kabesha 
 * @author Isaiah Ayres
 * @author Dan Obrien
 */

public class PairBox<T, U> implements Transformer<T> {
    private T object1;
    private U object2;

    // Constructor to initialize the objects
    public PairBox(T object1, U object2) {
        this.object1 = object1;
        this.object2 = object2;
    }

    // Getter and setter methods for the first object (type T)
    public T getObject1() {
        return object1;
    }

    public void setObject1(T object1) {
        this.object1 = object1;
    }

    // Getter and setter methods for the second object (type U)
    public U getObject2() {
        return object2;
    }

    public void setObject2(U object2) {
        this.object2 = object2;
    }

    // Implementing transform method from Transformer interface
    @SuppressWarnings("unchecked")
    @Override
    public T transform(T input) {
        // Simple transformation: add the input to the first value
        if (input instanceof Integer && object1 instanceof Integer) {
            return (T) Integer.valueOf(((Integer) object1) + ((Integer) input));
        } else {
            // Return input as is if the types are not compatible
            return input;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            // Taking input for an integer value
            System.out.print("Enter an integer value for T: ");
            int t = scanner.nextInt();
            scanner.nextLine(); // Consume newline left-over

            // Taking input for a string value
            System.out.print("Enter a string value for U: ");
            String u = scanner.nextLine();

            // Create a PairBox with user-provided values
            PairBox<Integer, String> pairBox = new PairBox<>(t, u);
            System.out.println("Original PairBox: (" + pairBox.getObject1() + ", " + pairBox.getObject2() + ")");

            // Swap the elements in the PairBox using BoxSwapper
            BoxSwapper.swap(pairBox);
            System.out.println("Swapped PairBox: (" + u + ", " + t + ")");
        } finally {
            // Close the Scanner
            scanner.close();
        }
    }
}