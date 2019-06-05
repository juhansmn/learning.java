package net.datastructures;

/**
 * Runtime exception thrown when the capacity of the array used by an
 * ArrayQueue has been exceeded.
 * @see ArrayQueue
 * @author Dinak
*/

public class FullQueueException extends RuntimeException {

    public FullQueueException(String err) {
        super(err);
    }
}
