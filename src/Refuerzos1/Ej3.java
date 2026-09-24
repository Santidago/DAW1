package Refuerzos1;

import java.util.Scanner;

public class Ej3 {
    public static void main(String[] args) {
        int num1,num2,multi;
        Scanner lector = new Scanner(System.in);
        System.out.println("Inserte 2 numeros");
        num1 = lector.nextInt();
        num2 = lector.nextInt();
        multi = num1%num2;
        if (multi==0)
        {
            System.out.println(num1 + " es multiplo de " + num2);
        }
    }
}
