package com.company;

public class IntroducaoMetodos {

    private static int matematica(int parametro1, int parametro2){
        int soma = parametro1 + parametro2;
        int multiplicacao = soma * 2;
        return multiplicacao;
    }

    public static void main(String[] args){
        int numero1 = 5;
        int numero2 = 5;
        int retorno = matematica(numero1,numero2);

        System.out.println("o resultado é: " + retorno);
    }
}
