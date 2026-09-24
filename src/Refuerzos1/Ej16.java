package Refuerzos1;

import java.util.Scanner;

public class Ej16 {
    public static void main(String[] args) {
        int num,num1,num2;
        Scanner lector = new Scanner(System.in);
        System.out.println("Inserte 3 numeros");
        num  = lector.nextInt();
        num1 = lector.nextInt();
        num2 = lector.nextInt();
        if (num > num1 && num > num2)
        {
            System.out.println(num+" es el mayor de los 3");
        }
        else if (num1 > num && num1 > num2)
        {
            System.out.println(num1+" es el mayor de los 3");
        }
        else if (num2 > num1 && num2 > num)
        {
            System.out.println(num2+" es el mayor de los 3");
        }
        else
        {
            System.out.println("No hay un solo numero mayor que los otros");
        }
    }
}
