package net.checker;

import net.datastructures.ArrayStack;
import java.lang.*;

public class Checker{
    public boolean checarTipo(char topo, char fechado) {
        if (topo == '{' && fechado == '}')
            return true;
        else if (topo == '[' && fechado == ']')
            return true;
        else if (topo == '(' && fechado == ')')
            return true;

        return false;
    }

    public String checarBalanceado(ArrayStack<Character> pilha, String sequencia){

        System.out.println("\n Sequência digitada: " + sequencia);
        char[] sequenciaArray = sequencia.toCharArray();

        //Array de Abertos e Fechados
        char[] simbolosAbertos = {'{', '[', '('}, simbolosFechados = {'}', ']', ')'};

        //Varredura da sequência.
        for (int i = 0; i < sequenciaArray.length; i++){
            for (int j = 0; j < simbolosAbertos.length; j++){
                //Se encontrar símbolo de abertura, empurra para a Pilha.
                if (sequenciaArray[i] == simbolosAbertos[j])
                    pilha.push(sequenciaArray[i]);
                //Se encontrar símbolo de encerramento, compara com o topo da pilha, se o topo for um símbolo de abertura o puxa para fora da Pilha.
                else if (sequenciaArray[i] == simbolosFechados[j]){
                    if (pilha.isEmpty()){ 
                        return "Desbalanceado.";
                    }
                    else{
                        //Verifica se os símbolos tipográficos são do mesmo tipo.
                        if(checarTipo(pilha.top(), simbolosFechados[j]))
                            pilha.pop();
                        else
                            return "Desbalanceado.";
                    }
                }
            }
        }
        if(pilha.size() == 0)
            return "Balanceado.";
        else
            return "Desbalanceado.";
    }
}