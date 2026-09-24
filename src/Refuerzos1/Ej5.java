package Refuerzos1;

import java.util.Scanner;

public class Ej5 {
    public static void main(String[] args) {
        int num1, num2;
        Scanner lector = new Scanner(System.in);
        System.out.println("Inserte un numero");
        num1 = lector.nextInt();
        if (num1 == 0)
        {
            System.out.println("El producto de 0 por cualquier número es 0");
        }
        else
        {
            System.out.println("Inserte el segundo numero");
            num2 = lector.nextInt();
            System.out.println("La multiplicacion de " + num1 + " x " + num2 + " = " + (num1*num2));
        }
    }
}
