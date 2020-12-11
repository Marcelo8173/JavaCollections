/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javacolletions;

import java.util.function.UnaryOperator;

/**
 *
 */
public class ParadigmaFuncional {
    public static void main(String[] args) {
        //imperativo
        int multi = 3;
        int valor1 = 10;
        int result1 = valor1*multi;
        System.out.println(result1);
        //funcional
        UnaryOperator<Integer> calcularValor = valor -> valor*3; //é apenas declarado a função que vai realizar a operação
        int valor = 10;
        System.out.println(calcularValor.apply(valor));
    }
}
