package principal;

import net.datastructures.ArrayQueue;
import net.roundrobin.RoundRobin;

/* Código feito por:
Caio Braga Silva,
Juan Victor Suman,
Matheus Eiji.
*/

public class Program {
    public static void main(String[] Args) {
        ArrayQueue<Integer> filaProcessos = new ArrayQueue<>();
        ArrayQueue<Integer> filaID = new ArrayQueue<>();

        filaProcessos.enqueue(45);
        filaProcessos.enqueue(12);
        filaProcessos.enqueue(77);
        filaProcessos.enqueue(54);
        filaProcessos.enqueue(63);

        filaID.enqueue(67281);
        filaID.enqueue(921);
        filaID.enqueue(1928);
        filaID.enqueue(55555);
        filaID.enqueue(12345);

        RoundRobin.roundrobin(filaID, filaProcessos);

    }
}