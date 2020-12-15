/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javacolletions;
import java.util.function.Consumer;
/**
 *
 * @author marcelo
 */
public class ConsumerFunction {
    public static void main(String[] args) {
        //recebe um parametro e não retorna nada
        //sempre que for uma lambida vai ser: 
        // nome da variavel -> implementação numa linha ou entre {}
        Consumer<String> imprimi = System.out::println;
        Consumer<String> imprimirUmaFrase = frase -> System.out.println(frase);
        imprimi.accept("Olá mundo1");
        imprimirUmaFrase.accept("Olá mundo");
    }
}
