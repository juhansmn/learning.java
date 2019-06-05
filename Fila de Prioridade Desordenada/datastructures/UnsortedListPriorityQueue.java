package datastructures;
import java.util.LinkedList;
import java.util.Comparator;

public class UnsortedListPriorityQueue<K,V> implements PriorityQueue<K,V> {
    protected LinkedList<Entry<K,V>> filaPrioridade;
    protected Comparator<K> comparator;

    protected static class Element<K,V> implements Entry<K,V>{
        protected K k; //chave
        protected V v; //valor

        public Element(){
            k = null;
            v = null;
        }

        public Element(K key, V value){
            k = key;
            v = value;
        }
        public K getKey() { 
            return k; 
        }
        public V getValue() { 
            return v; 
        }
        public String toString() { 
            return "(" + k  + "," + v + ")"; 
        }
    }

    public UnsortedListPriorityQueue(){
        //Inicializa a lista.
        filaPrioridade = new LinkedList<>();
        comparator = new DefaultComparator<K>();
    }

    public int size(){
        //Retorna o tamanho da Lista.
        return filaPrioridade.size();
    }

    public boolean isEmpty(){
        //Verifica se a lista está vazia. Retorna o resultado booleano.
        return filaPrioridade.isEmpty();
    }

    public Entry<K,V> min() throws IllegalStateException {
        //O(n). Percorre a lista. Retorna mas não remove o menor elemento.

        if (filaPrioridade.isEmpty())
            throw new IllegalStateException("A fila de prioridade está vazia!");
        
        return findMin();
    }

    public void insert(K key, V value){
        //O(1). Adiciona sempre na última posição da lista.

        Entry<K,V> newEntry = new Element<>(key, value);

        filaPrioridade.add(newEntry);
    }

    public Entry<K,V> removeMin() throws IllegalStateException {
        //O(n). Percorre a lista, encontra a entrada com a menor chave e o remove.

        if (filaPrioridade.isEmpty())
            throw new IllegalStateException("A fila de prioridade está vazia!");
            
        Entry<K,V> temp = findMin();

        filaPrioridade.remove(temp);
        //Após remover, retorna o elemento retirado.
        return temp;
    }

    public Entry<K,V> findMin() throws IllegalStateException {
        Entry<K,V> temp = new Element<K,V>();  

        if (filaPrioridade.isEmpty())
            throw new IllegalStateException("A fila de prioridade está vazia!");

        for (int i = 0; i < filaPrioridade.size(); i++) {
            if (temp.getKey() == null && temp.getValue() == null){
                temp = filaPrioridade.get(i);
            }
            
            //Se a for maior que b, o menor deve ser atualizado.
            if (comparator.compare(temp.getKey(), filaPrioridade.get(i).getKey()) > 0)
                temp = filaPrioridade.get(i);
        }
        
        return temp;
    }
}