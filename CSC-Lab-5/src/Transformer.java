/**
 * Transformer interface for defining a transformation operation on a generic type.
 *
 * @author Joseph Kabesha 
 * @author Isaiah Ayres
 * @author Dan Obrien
 * 
 * @param <T> The type on which the transformation operates.
 */
interface Transformer<T> {
    /**
     * Transforms the input of type T and returns the result.
     *
     * @param input The input of type T to be transformed.
     * @return The transformed result of type T.
     */
    T transform(T input);
}