package Refuerzos1;

import java.util.Scanner;

public class Ej14 {
    public static void main(String[] args) {
        int num1,num2;
        Scanner lector = new Scanner(System.in);
        System.out.println("Inserte 2 numeros");
        num1 = lector.nextInt();
        num2 = lector.nextInt();
        if (num1 >= 0 && num2 >= 0)
        {
            System.out.println("Ambos numeros son positivos");
        }
        else if (num1 >=0 || num2 >=0)
        {
            System.out.println("Solo uno es positivo");
        }
        else
        {
            System.out.println("Ninguno es positivo");
        }

    }
}
