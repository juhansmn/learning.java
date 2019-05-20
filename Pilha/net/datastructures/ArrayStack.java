package net.datastructures;

//begin#fragment ArrayStack
 /**
  * Implementation of the stack ADT using a fixed-length array.  An
  * exception is thrown if a push operation is attempted when the size
  * of the stack is equal to the length of the array.  This class
  * includes the main methods of the built-in class java.util.Stack.
//end#fragment ArrayStack
  * 
  * @author Natasha Gelfand
  * @author Roberto Tamassia
  * @see FullStackException
//begin#fragment ArrayStack
  */
//begin#fragment ArrayStack
public class ArrayStack<E> implements Stack<E> {
//end#fragment ArrayStack
 /**
  * Length of the array used to implement the stack.
  */
//begin#fragment ArrayStack
  protected int capacity; 	// The actual capacity of the stack array
//end#fragment ArrayStack
 /**
  * Default array capacity.
  */
//begin#fragment ArrayStack
  public static final int CAPACITY = 1000;	// default array capacity
//end#fragment ArrayStack
 /**
  * Array used to implement the stack.
  */
//begin#fragment ArrayStack
  protected E S[];		// Generic array used to implement the stack 
//end#fragment ArrayStack
 /**
  * Index of the top element of the stack in the array.
  */
//begin#fragment ArrayStack
  protected int top = -1;	// index for the top of the stack
//end#fragment ArrayStack
 /**
  * Initializes the stack to use an array of default length.
  */
//begin#fragment ArrayStack
  public ArrayStack() {
    this(CAPACITY); // default capacity 
  }
//end#fragment ArrayStack
 /**
  * Initializes the stack to use an array of given length.
  * @param cap length of the array.
  */
//begin#fragment ArrayStack
  public ArrayStack(int cap) {
    capacity = cap;
    S = (E[]) new Object[capacity]; // compiler may give warning, but this is ok
  }
//end#fragment ArrayStack
 /**
  * Returns the number of elements in the stack.
  * This method runs in O(1) time.
  * @return number of elements in the stack. 
  */
//begin#fragment ArrayStack
  public int size() { 
      return top + 1;
  }
//end#fragment ArrayStack
 /**
  * Testes whether the stack is empty.
  * This method runs in O(1) time.
  * @return true if the stack is empty, false otherwise.
  */
//begin#fragment ArrayStack
  public boolean isEmpty() {
      if (top == -1)
            return true;
      
      return false;
  }
//end#fragment ArrayStack
 /**
  * Inserts an element at the top of the stack.
  * This method runs in O(1) time.
  * @return element inserted.
  * @param element element to be inserted.
  * @exception FullStackException if the array storing the elements is full.
  */


//begin#fragment ArrayStack
  public void push(E element) throws FullStackException {
      if (top == capacity){
          throw new FullStackException("Pilha cheia.");
      }
      else{
          top += 1;
          S[top] = element;
      }  
  }
//end#fragment ArrayStack
 /**
  * Inspects the element at the top of the stack.
  * This method runs in O(1) time.
  * @return top element in the stack.  
  * @exception EmptyStackException if the stack is empty. 
  */
//begin#fragment ArrayStack
  public E top() throws EmptyStackException {
      if (isEmpty()){
          throw new EmptyStackException("Pilha vazia.");
      }
      return S[top];
    }
//end#fragment ArrayStack
 /**
  * Removes the top element from the stack.
  * This method runs in O(1) time.
  * @return element removed.
  * @exception EmptyStackException if the stack is empty.
  */
//begin#fragment ArrayStack
  public E pop() throws EmptyStackException {
      if (isEmpty()){
          throw new EmptyStackException("Pilha vazia.");
      }  
      else{
          E temp = S[top];
          S[top] = null;
          top -= 1;
          return temp; 
      }
  }
//end#fragment ArrayStack

 /**
  * Returns a string representation of the stack as a list of elements,
  * with the top element at the end: [ ... , prev, top ].
  * This method runs in O(n) time, where n is the size of the stack.
  * @return textual representation of the stack.
  */
//begin#fragment ArrayStack2
  public String toString() {
    String s;
    s = "[";
    if (size() > 0) s+= S[0];
    if (size() > 1)
      for (int i = 1; i <= size()-1; i++) {
	      s += ", " + S[i];
      }
    return s + "]";
  }
//end#fragment ArrayStack2
 /**
  * Prints status information about a recent operation and the stack.
  * @param op operation performed
  * @param element element returned by the operation
  * @return information about the operation performed, the element
  * returned by the operation and the content of the stack after 
  * the operation.
  */ 
//begin#fragment ArrayStack2
//  Prints status information about a recent operation and the stack.
  public void status(String op, Object element) {
    System.out.print("------> " + op);   // print this operation
    System.out.println(", returns " + element); // what was returned
    System.out.print("result: size = " + size() + ", isEmpty = " + isEmpty());
    System.out.println(", stack: " + this);       // contents of the stack
  }
//end#fragment ArrayStack2
}
//end#fragment ArrayStack2

// Função para fazer a separação dos caracteres e verificar a existência de símbolos específicos.

