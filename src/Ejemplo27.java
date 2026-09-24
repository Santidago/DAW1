import java.util.Scanner;

public class Ejemplo27 {
    public static void main(String[] args) {
        int num,rell,canti;
        Scanner lector = new Scanner(System.in);
        System.out.println("Introdusca un numero");
        num = lector.nextInt();
        for (canti = 0;canti <= num;canti++ )
        {
            for (rell = 1; rell <= canti;rell++)
            {
                System.out.print(" " + rell + " ");
            }
            System.out.println();
        }
    }
}
