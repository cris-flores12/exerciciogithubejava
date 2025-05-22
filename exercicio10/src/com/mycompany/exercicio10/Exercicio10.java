package com.mycompany.exercicio10;

import java.util.Scanner;

public class Exercicio10 {

    public static void main(String[] args) {
        Scanner Objtest = new Scanner(System.in);
        System.out.println("digite um numero");
        int n1 = Objtest.nextInt();
        boolean opa = true;
        boolean re = fibo(n1, opa);
        System.out.println(re);
    }

    public static boolean fibo(int n1, boolean opa) {
        int n2 = 1;
        int n3 = 1;
        int n4;

        while (n3 <= n1) {
            if (n3 == n1) {
                return true;
            }
            n4 = n3;
            n3 = n2 + n3;
            n2 = n4;
        }
        return false;
    }
}

