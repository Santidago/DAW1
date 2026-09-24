package Refuerzos1;

import java.util.Scanner;

public class Ej13 {
    public static void main(String[] args) {
        int num1,num2,div,par=0;
        Scanner lector = new Scanner(System.in);
        System.out.println("Inserte 2 numeros");
        num1 = lector.nextInt();
        num2 = lector.nextInt();
        div = num1%2;
        if (div==0)
        {
            par++;
        }
        div = num2%2;
        if (div==0)
        {
            par++;
        }
        if (par == 1)
        {
            System.out.println("Hay un solo numero primo en los numeros insertados");
        }
    }
}
