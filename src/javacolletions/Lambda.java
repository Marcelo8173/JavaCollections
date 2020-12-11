/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javacolletions;

public class Lambda {
    public static void main(String[] args) {
        //cara criar uma lambda é necessario ter atrelado a ela uma interface funcional.
        //é um metodo abstrado
        Funcao1 fun = valor -> valor;
        System.out.println(fun.gerar("A"));
        // interfaceFuncional nomeDaVariavel = parametro -> logica
        //quando é uma logica pequena não precisa de chaves
        //mais de um parametro e/ou retorno precisa de chaves
        Funcao1 func1 = valor -> {
            String valorComPrefixo = "Sr. " + valor;
            String valorFinal = valorComPrefixo+".";
            return valorFinal;
        };
        System.out.println(func1.gerar("Marcelo"));
    }
}


@FunctionalInterface //não é obrigatorio
interface Funcao1{
    String gerar(String valor);
//    não é possivel colocar mais uma função
}