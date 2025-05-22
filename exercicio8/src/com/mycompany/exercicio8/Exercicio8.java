package com.mycompany.exercicio8;

import java.awt.BorderLayout;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Exercicio8 {

    public static void main(String[] args) {
        int n1, n2 = 0;
        Scanner Objtest = new Scanner(System.in);
        System.out.println("informe quantos elementos o vetor terá:");
        n1 = Objtest.nextInt();
        int[] ve = new int[n1];
        System.out.println(Arrays.toString(ve));
        n1--;
        while (n1 >= 0) {
            System.out.println("digite o valor de um dos elementode (de tras pra frente)");
            n2 = Objtest.nextInt();
            ve[n1] = n2;
            n1--;
        }
        System.out.println("normal");
        System.out.println(Arrays.toString(ve));
        System.out.println("invertido");
        int[] re = invertido(n1, n2, ve);
        System.out.println(Arrays.toString(re));
    }

    public static int[] invertido(int n1, int n2, int[] ve) {
        int[] ve1 = new int[ve.length];

        for (int i = 0; i < ve.length; i++) {
            ve1[ve.length - 1 - i] = ve[i];
        }
        return ve1;
    }
}
