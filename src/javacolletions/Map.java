/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javacolletions;

import java.util.HashMap;

/**
 *
 * @author marcelo
 */
public class Map {
    public static void main(String[] args) {
        //map não é um interface do java util
        //alguns metodos podem ser diferente
        //entrada de chave e valor
        //permite valores repetidos
        //mas não pode repetir chave
        //permite todo o crud por chave ou por valor
        //pode ser ordenada
        HashMap<String, Integer> vencedoresDoMundialDaFifa = new HashMap<>();
        vencedoresDoMundialDaFifa.put("brasil", 5);
        vencedoresDoMundialDaFifa.put("alemanha", 4);
        vencedoresDoMundialDaFifa.put("italia", 4);
        vencedoresDoMundialDaFifa.put("argentina", 2);
        
        System.out.println(vencedoresDoMundialDaFifa);
        
        //atualizar o valor por meio da chave
        vencedoresDoMundialDaFifa.put("brasil", 6);
                System.out.println(vencedoresDoMundialDaFifa);
         
        //metodos get
        System.out.println(vencedoresDoMundialDaFifa.get("argentina"));
        //se existe
        System.out.println(vencedoresDoMundialDaFifa.containsKey("argentina"));

        for (java.util.Map.Entry<String, Integer> entry : vencedoresDoMundialDaFifa.entrySet()) {
            String key = entry.getKey();
            Integer value = entry.getValue();
            System.out.println("chave = " + key + "______" + "valor = " + value);
        }
        
        for (String arg : vencedoresDoMundialDaFifa.keySet()) {
            System.out.println(arg);
        }
    }
}
