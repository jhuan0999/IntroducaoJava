package com.company;
import java.util.Scanner;

/*
  A implementação deve considerar as seguintes regras:
  - Caso os dois números recebidos sejam iguais, o método retorna o dobro da soma;
  - Caso um dos números seja menor do que 1, o método retorna -1;
  - Caso nenhuma das condições anteriores seja verdadeira, o método retorna a soma dos dois números.

  Exemplos de entrada e saida:
    somaDobrada(1, 2); // retorna 3
    somaDobrada(3, 2); // retorna 5
    somaDobrada(2, 2); // retorna 8
    somaDobrada(7, 7); // retorna 28
    somaDobrada(3, -3); // retorna -1
   */
public class SomaDobrada {

    public static Scanner leitor = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("digite o primeiro numero: ");
        int numero1 = leitor.nextInt();
        System.out.print("digite o segundo numero: ");
        int numero2 = leitor.nextInt();

        if (numero1 == numero2){
            int retorno = numero1 + numero2;
            System.out.println(retorno * 2);
        }else if(numero1 < 1 || numero2 < 1){
            System.out.println(-1);
        }else{
            System.out.println(numero1 + numero2);
        }
    }
}
