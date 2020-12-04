package javacolletions;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class list {
    public static void main(String[] args) {
        //arraylist
        // garante a ordem de inserção
        List<String> listaDeNomes = new ArrayList<String>();
        
        //metodos de add 
        listaDeNomes.add("Marcelo");
        listaDeNomes.add("André");
        listaDeNomes.add("Souza");
        
        System.out.println(listaDeNomes);
        
        //ordenando em ordem alfabetica de forma simples porém é mais completo usar comparators
        Collections.sort(listaDeNomes);
        System.out.println(listaDeNomes);
        
        //metodos
        //alterando informações
        listaDeNomes.set(0, "Caio"); //tomar cuidado que ele pega depois da ordanação
        System.out.println(listaDeNomes);
        int index = 0;
        for (int i = 0; i < listaDeNomes.size(); i++) {
             if(listaDeNomes.get(i).equals("Marcelo")){
                 index = i;
             };
        }
        listaDeNomes.set(index, "Joia");
        System.out.println(listaDeNomes);
        
        //se um elemento tem na lista
        System.out.println(listaDeNomes.contains("marcelo"));
        
        //retorna true se a lista estiver vazia
        listaDeNomes.isEmpty();
        
        //limpando uma lista
        listaDeNomes.clear();
        System.out.println(listaDeNomes.isEmpty());
    }
    
}
