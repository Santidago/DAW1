package Refuerzos1;

import java.util.Scanner;

public class Ej17 {
    public static void main(String[] args) {
        int num,num1;
        Scanner lector = new Scanner(System.in);
        System.out.println("Inserte 2 numeros");
        num  = lector.nextInt();
        num1 = lector.nextInt();
        if (num > num1)
        {
            System.out.println(num+" es el mayor de los 2");
        }
        else if (num1 > num)
        {
            System.out.println(num1+" es el mayor de los 2");
        }
        else
        {
            System.out.println("Ambos numeros son iguales");
        }
    }
}
