package com.mycompany.exercicio09;

import java.util.Scanner;

public class Exercicio09 {

    public static void main(String[] args) {
        Scanner Objtest = new Scanner(System.in);
        System.out.println("digite um numero:");
        double n1 = Objtest.nextInt();
        System.out.println("digite quantos porcentos voce quer desse numero(nao use %)");
        double n2 = Objtest.nextInt();
        double re2 = 0;
        double re = por(n1, n2);
        System.out.println("resultado");
        System.out.println(re);
    }

    public static double por(double n1, double n2) {
        n2 /= 100;
        n2*=n1;
        return n2;
    }
}
