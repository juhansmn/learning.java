package datastructures;

public interface PriorityQueue<K,V> {
  public int size();
  public boolean isEmpty();
  public Entry<K,V> min() throws IllegalStateException;
  public void insert(K key, V value);
  public Entry<K,V> removeMin() throws IllegalStateException;
}
