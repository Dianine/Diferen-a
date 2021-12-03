package Programa;

import java.util.Locale;
import java.util.Scanner;

public class Diferenca {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double a, b, c, d, diferença;

        a = sc.nextDouble();
        b = sc.nextDouble();
        c = sc.nextDouble();
        d = sc.nextDouble();

        diferença = a * b - c * d;

        System.out.printf("DIFERENÇA: %.2f", diferença);



        sc.close();
    }
}
