/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio03;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author aluno.saolucas
 */
public class Exercicio03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
   int n1, n2 = 0;
        Scanner Objtest = new Scanner(System.in);
        System.out.println("informe quantos elementos o vetor terá:");
        n1 = Objtest.nextInt();
        int[] ve = new int[n1];
        System.out.println(Arrays.toString(ve));
        n1--;
        while (n1 >= 0) {
            System.out.println("digite o valor de um dos elemento");
            n2 = Objtest.nextInt();
            ve[n1] = n2;
            n1--;
        }
        System.out.println(Arrays.toString(ve));
        int re = vetor(ve, n1, n2);
        System.out.println(re);
    }

    public static int vetor(int[] ve, int n1, int n2) {
        int n3 = n2;
        for (int i = 0; i < ve.length; i++) {
            int n4 = Math.abs(ve[i]);
            if (n4 > n3) {
                n3 = n4;
            }
        }
        return n3;
    }
}

