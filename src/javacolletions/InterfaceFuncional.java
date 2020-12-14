/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javacolletions;

/**
 *
 * @author marcelo
 */
public class InterfaceFuncional {
    public static void main(String[] args) {
        // funções de alta ordem: são funções que recebem uma função por paremetro ou devolvem uma função por parametro
        //crio uma interface generica que apenas mudo a regra aplicada no lambda
       
        Calcular somar = (a,b) -> a+b;
        Calcular subtracao = (a,b) -> a-b;
        System.out.println(executarOperacao(somar,1,3));
        System.out.println(executarOperacao(subtracao,1,3));

        
        
    }
      public static int executarOperacao(Calcular calculo, int a, int b){
            return calculo.calculos(a, b);
        }
}


@FunctionalInterface
interface Calcular{
    public int calculos(int a, int b);
}