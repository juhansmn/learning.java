package principal;
import datastructures.UnsortedListPriorityQueue;

/*
Atividade do Terceiro Semestre de Ciência da Computação.
Estrutura de Dados.

Participantes:
    - Caio Braga Silva;
    - Juan Victor Suman;
    - Lucas Gomes Santana;
    - Matheus Eiji Moriya;
*/

public class FilaPrioridadeDesordenada{
    public static void main(String[] args) {
        System.out.println("Fila de prioridades desordenada.");
        UnsortedListPriorityQueue<Integer,String> fila = new UnsortedListPriorityQueue<>();

        fila.insert(3, "Caio");
        fila.insert(0, "Dionathan");
        fila.insert(2, "Juan");
        fila.insert(4, "Lucas");
        fila.insert(1, "Eiji");        
        
        System.out.println("Tamanho: " + fila.size());

        System.out.println(fila.removeMin().toString());
        System.out.println(fila.removeMin().toString());
        System.out.println(fila.removeMin().toString());
        System.out.println(fila.removeMin().toString());
        System.out.println(fila.removeMin().toString());
        System.out.println(fila.removeMin().toString());
    }
}