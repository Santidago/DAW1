package Refuerzos1;

import java.util.Scanner;

public class Ej6 {
    public static void main(String[] args) {
        int num1,num2;
        Scanner lector = new Scanner(System.in);
        System.out.println("Inserte 2 numeros para dividir");
        num1 = lector.nextInt();
        num2 = lector.nextInt();
        if (num2 == 0)
        {
            System.out.println("Error: No se puede dividir entre cero");
        }
        else
        {
            System.out.println(num1 + "/" + num2 + " = " + (num1/num2));
        }
    }
}
