/**
 * Utility class for swapping elements in a PairBox.
 * 
 * This class provides a static method, swap, for swapping the values of a PairBox.
 * It is intended to be used with PairBox instances containing two different types of objects.
 * 
 * @author Joseph Kabesha 
 * @author Isaiah Ayres
 * @author Dan Obrien
 * 
 * @param pairBox The PairBox containing values to be swapped.
 * @param <T>     The type of the first object in PairBox.
 * @param <U>     The type of the second object in PairBox.
 */
public class BoxSwapper {
    @SuppressWarnings("unchecked")
    public static <T, U> void swap(PairBox<T, U> pairBox) {
        // Temporary variable to hold the value of object1 during swapping
        T temp = pairBox.getObject1();

        // Set object1 to the value of object2
        pairBox.setObject1((T) pairBox.getObject2());

        // Set object2 to the original value of object1
        pairBox.setObject2((U) temp);
    }
}