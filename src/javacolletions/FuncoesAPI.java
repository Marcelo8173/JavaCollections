/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javacolletions;
import java.util.function.Function;
import java.util.function.Predicate;
/**
 *
 * @author marcelo
 */
public class FuncoesAPI {
    public static void main(String[] args) {
        //Function recebe um parametro e devolve um parametro
        //T e r => p é oq recebe e T é oq ele retorna
        Function<String,String> retornaNomeAoContrario = texto -> new StringBuilder(texto).reverse().toString();
        String nome = retornaNomeAoContrario.apply("Texto");
        System.out.println(nome);
        
        //oq ele retorna e depois oq recebe
        Function<String,Integer> converte = numeroEmInteiro -> Integer.valueOf(numeroEmInteiro);
        int numeroEmValorDeInteiro = converte.apply("20");
        System.out.println(numeroEmValorDeInteiro);
        
        //predicados serve para validar dados
        Predicate<String> estaVazio = valor -> valor.isEmpty();
        System.out.println(estaVazio.test("a"));
        System.out.println(estaVazio.test(""));

    }
}
