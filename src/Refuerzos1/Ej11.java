package Refuerzos1;

import java.util.Scanner;

public class Ej11 {
    public static void main(String[] args) {
        int num1,num2,div;
        Scanner lector = new Scanner(System.in);
        System.out.println("Inserte 2 numeros");
        num1 = lector.nextInt();
        num2 = lector.nextInt();
        div = num1%2;
        if (div==0)
        {
            div = num2%2;
            if (div==0)
            {
                System.out.println(num1+" "+num2+" son ambos pares");
            }
        }
    }
}
