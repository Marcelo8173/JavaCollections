package javacolletions;

import java.util.LinkedList;
import java.util.Queue;


public class queue {
        public static void main(String[] args) {
        //serve para implementar uma fila
        //linkedList
        //garante a ordem de inserção do elemento
        // FIFO
        //não permite a alteração do elemento71
        Queue<String> filaDeBanco = new LinkedList<String>();
        
        //add elementos
        filaDeBanco.add("Marcelo");
        filaDeBanco.add("André");
        filaDeBanco.add("Souza");
        filaDeBanco.add("jesica ");
        System.out.println(filaDeBanco);
        //metodos de remoção peek retorna mas não remove o elemento e retorna null,
        //metodo element retorna uma exeção
        String clienteASerAtendido = filaDeBanco.poll(); //remove o primeiro elemento
        System.out.println(clienteASerAtendido);
        System.out.println(filaDeBanco);
        
        String primeiroCliente = filaDeBanco.peek(); //mostra o elemento a ser retirado
        System.out.println(primeiroCliente);
        System.out.println(filaDeBanco);
        
        filaDeBanco.clear();
            System.out.println(filaDeBanco.element());
    }
}
