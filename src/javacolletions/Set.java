/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javacolletions;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;


/**
 *
 * @author marcelo
 */
public class Set {
    public static void main(String[] args) {
        //java util set;
        //por padrão não garante a ordem de inserção
        //não permitem itens repetidos
        //performance para leitura dos dados 
        //não permite busca e atualização de dados
        //não permite mudar a ordenação
        //hasset = usada quando não é preciso manter a ordenação/não permite valores repetidos/e é performatica
        //linkedHashSet = usada quando é necessario manter a ordem de inserção/mantem a ordem de inserção/menos performatica
        //TreeSet = quando é necessario mudar a ordem por meio de comparators/mantem a ordem e pode ser reodenado
        HashSet<Integer> notas = new HashSet<>();
        
        notas.add(1);
        notas.add(2);
        notas.add(3);
        notas.add(4);
        notas.add(5);
        
        System.out.println(notas);
        
        LinkedHashSet<Integer> notas1 = new LinkedHashSet<>();
        notas1.add(1);
        notas1.add(2);
        notas1.add(3);
        notas1.add(4);
        notas1.add(5);
        notas1.add(5);

        
        System.out.println(notas1);
        
        TreeSet<Integer> notas2 = new TreeSet<>();
        
        notas2.add(1);
        notas2.add(2);
        notas2.add(3);
        notas2.add(4);
        notas2.add(5);
        
        System.out.println(notas2);
        System.err.println(notas2.first());
        System.err.println(notas2.last());


    }
}
