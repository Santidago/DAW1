package Refuerzos1;

import java.util.Scanner;

public class Ej9 {
    public static void main(String[] args) {
        int num,dos,tres;
        Scanner lector = new Scanner(System.in);
        System.out.println("Inserte un numero");
        num = lector.nextInt();
        dos = num%2;
        tres = num%3;
        if (dos==0 && tres!=0)
        {
            System.out.println(num + " Es multiplo de 2 y no es multiplo de 3");
        }
    }
}
