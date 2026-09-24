package Refuerzos1;

import java.util.Scanner;

public class Ej2 {
    public static void main(String[] args) {
        int num,par;
        Scanner lector = new Scanner(System.in);
        System.out.println("Inserte un numero");
        num = lector.nextInt();
        par = num%2;
        if (par == 0)
        {
            System.out.println(num + " es un numero par");
        }
        else
        {
            System.out.println(num + " no es un numero par");
        }

    }
}
