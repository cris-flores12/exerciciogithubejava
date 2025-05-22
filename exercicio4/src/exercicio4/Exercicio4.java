package exercicio4;

import java.util.Arrays;
import java.util.Scanner;

public class Exercicio4 {

    public static void main(String[] args) {
        String[] ve = {"Henrique", "Arthur", "Rafael", "Cristian"};
        System.out.println(Arrays.toString(ve));
        String re = contarVogais(ve);
        System.out.println(re);
    }

    private static String contarVogais(String[] ve) {
        int contador = 0;
        int contador1 = 0;
        int contador2 = 0;
        int contador3 = 0;
        if (ve[0] == "Henrique") {
            for (char c : ve[0].toCharArray()) {
                if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u'
                        || c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U') {
                    contador++;
                }
            }
        } else if (ve[1] == "Arthur") {
            for (char c : ve[1].toCharArray()) {
                if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u'
                        || c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U') {
                    contador1++;
                }
            }
        } else if (ve[2] == "Rafael") {

            for (char c : ve[2].toCharArray()) {
                if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u'
                        || c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U') {
                    contador2++;
                }
            }
        } else {
            for (char c : ve[3].toCharArray()) {
                if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u'
                        || c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U') {
                    contador3++;
                }
            }
        }
        if (contador > contador1 && contador > contador2 && contador > contador3) {
            return "Henrique";
        } else if (contador1 > contador && contador1 > contador2 && contador1 > contador3) {
            return "Arthur";
        } else if (contador2 > contador && contador2 > contador1 && contador2 > contador3) {
            return "Rafeal";
        } else {
            return "Cristian";
        }
    }
}

