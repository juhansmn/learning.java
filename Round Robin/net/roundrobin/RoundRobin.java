package net.roundrobin;

import net.datastructures.ArrayQueue;

public class RoundRobin {
    public static void roundrobin(ArrayQueue<Integer> filaID, ArrayQueue<Integer> filaProcessos){
        System.out.println("\nQuantidade de processos a serem executados: " + filaProcessos.size() + "\n-------------------------------------------------\n");

        while (!filaProcessos.isEmpty()) {//Enquanto a fila não estiver vazia.
            //Processo a ser executado está à frente da fila.
            System.out.println("Processo atual: " + filaID.front() + "  " + filaProcessos.front() + "\n");
            
            int processoAtual = filaProcessos.dequeue();
            int idAtual = filaID.dequeue();

            for (int quantum = 1; quantum <= 3; quantum++) {
                //O valor do processo é reduzido em 1 por 3 tempos (tempo de quantum)
                processoAtual -= 1;
                //Se o tempo for 3 ou o valor da fila == 0 a iteração termina.
                if (processoAtual == 0)
                    break;
            }
            //Se o processo for diferente de 0 ele é infileirado novamente.
            if (processoAtual > 0){
                filaProcessos.enqueue(processoAtual);
                filaID.enqueue(idAtual);
            }
            
            System.out.println("Processos restantes: " + filaProcessos.size() + "\n");

            if (filaProcessos.size() == 0)
                System.out.println("\n\nTodos os processos foram executados");
        }
    }
}