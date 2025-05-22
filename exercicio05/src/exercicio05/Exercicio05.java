package exercicio05;

import java.util.Scanner;

public class Exercicio05 {

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

