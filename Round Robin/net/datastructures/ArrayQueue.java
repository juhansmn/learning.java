package net.datastructures;

import java.util.EmptyStackException;

/**
 *
 * @author Dinak
 */
public class ArrayQueue<E> implements Queue<E> {

    public static final int CAPACITY = 1000;	// default array capacity
    protected int N;            // The actual capacity of the queue array
    protected E Q[];		// Generic array used to implement the queue 
    protected int f = 0;	// index for the front of the queue
    protected int r = f;	// index for the rear  of the queue

    public ArrayQueue() { this(CAPACITY); } // default capacity 
    public ArrayQueue(int cap) {
        N = cap;
        Q = (E[]) new Object[N]; // compiler may give warning, but this is ok
    }

    public int size() {  
        return (N - f + r) % N; 
    }

    public boolean isEmpty() {
        return (f == r);
    }

    public E front() throws EmptyQueueException {
        if (isEmpty()){
            throw new EmptyQueueException("Fila vazia.");
        }
        else{
            return Q[f];
        }
    }

    public void enqueue(E element) throws FullQueueException{
        if (size() == N - 1){
            throw new FullQueueException ("Fila cheia.");
        }
        else{
            Q[r] = element;
            r = (r + 1)%N; //Atualiza o rabo.
        }
    }

    public E dequeue() throws EmptyQueueException {
        E temp;
        if (isEmpty()){
            throw new EmptyQueueException ("Fila vazia.");
        }
        else{
            temp = Q[f];
            Q[f] = null;
            f = (f + 1) % N;//Atualiza a frente.
            return temp; 
        }
    }
}