package br.com.alura.investimento.principal;

import java.util.Scanner;

public class JurosPoupanca {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        System.out.println("digite seu nome:");
        String nome = scanner.nextLine();
        System.out.println(nome);
        System.out.println("Quantos anos você tem ?");
        int anos = scanner.nextInt();
        System.out.println("Quantos vai investir esse mês??");
        double investir = scanner.nextInt();
        System.out.println(nome + " de " + anos + " anos de idade, vai invesir " + investir + " esse mês!! daqui a 1 ano ele terá +" +
               investir * 0.6);
        System.out.println("Seu rendimento para daqui 1(um) ano " );
        }

    }


