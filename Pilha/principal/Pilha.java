package principal;

import net.datastructures.ArrayStack;
import net.checker.Checker;
import java.lang.*;

/*
ADO I:
    Caio Braga Silva,
    Juan Victor Suman.
*/

public class Pilha {
    public static void main(String[] args) {
        System.out.println("Pilha implementada em array.");
        ArrayStack<Character> primeiraPilha = new ArrayStack<>();
        ArrayStack<Character> segundaPilha = new ArrayStack<>();

        net.checker.Checker checador = new Checker();

        String sequenciaDesbalanceada = ")bbbc(](aaaaaaaaaaaaaaaaaaaaaa)))";
        System.out.println(checador.checarBalanceado(segundaPilha, sequenciaDesbalanceada));

        String sequenciaBalanceada = "bbbbc(aa!a(!!))";
        System.out.println(checador.checarBalanceado(primeiraPilha, sequenciaBalanceada));

    }
}