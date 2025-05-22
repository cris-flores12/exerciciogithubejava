/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio07;

import java.util.Scanner;

/**
 *
 * @author aluno.saolucas
 */
public class Exercicio07 {

    /**
     * @param args the command line arguments
     */
 public static void main(String[] args) {
        Scanner Objtest = new Scanner(System.in);
        System.out.println("digite umm numero");
        int n1 = Objtest.nextInt();
        System.out.println("digite outro numero");
        int n2 = Objtest.nextInt();
        int re = mdc(n1, n2);
        System.out.println("o máximo de divisores desses doi números são:"+re);
    }

    public static int mdc(int n1, int n2) {
        if (n1 > n2) {
            while (n2 != 0) {
                int sla = n2;
                n2 = n1 % n2;
                n1 = sla;
            }
            return n1;
        } else {
            while (n1 != 0) {
                int sla = n2;
                n1 = n2 % n1;
                n2 = sla;
            }
            return n2;
        }
    }
}
