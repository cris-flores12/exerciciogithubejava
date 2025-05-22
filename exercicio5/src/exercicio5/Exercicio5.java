/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio5;

import java.util.Scanner;

/**
 *
 * @author aluno.saolucas
 */
public class Exercicio5 {

    /**
     * @param args the command line arguments
     */
     public static void main(String[] args) {
        Scanner Objtest = new Scanner(System.in);
        System.out.println("digite um numero");
        int n1 = Objtest.nextInt();
        int re = fatorial(n1);
        System.out.println(re);
        
    }
    public static int fatorial(int n1){
        for(int i = (n1-1); i >= 1; i--){
            n1*=i;
        }
        return n1;
    }

}

