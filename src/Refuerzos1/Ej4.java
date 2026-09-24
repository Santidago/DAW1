package Refuerzos1;

import java.util.Scanner;

public class Ej4 {
    public static void main(String[] args) {
        int num1,num2,multi;
        Scanner lector = new Scanner(System.in);
        System.out.println("Inserte un multiplo de 10");
        num1 = lector.nextInt();
        multi = num1%10;
        if (multi==0)
        {
            System.out.println("Inserte un segundo multiplo de 10");
            num2 = lector.nextInt();
            multi = num2%10;
            if (multi==0)
            {
                System.out.println("Ambos numeros fueron multiplos de 10");
            }
            else
            {
                System.out.println("Solo el primero fue multiplo de 10");
            }
        }
        else
        {
            System.out.println("No es multiplo de 10");
        }
    }
}
