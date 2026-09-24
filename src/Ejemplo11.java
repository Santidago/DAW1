import java.util.Scanner;

public class Ejemplo11 {
    public static void main(String[] args) {
        float num1;
        float num2;
        Scanner lector = new Scanner(System.in);
        System.out.print("Introdusca numero 1 = ");
        num1 = lector.nextFloat();
        System.out.print("Introdusca numero 2 = " );
        num2 = lector.nextFloat();

        if (num1 > num2)
        {
            System.out.println(num2);
            System.out.println(num1);
        }
        else
        {
            System.out.println(num1);
            System.out.println(num2);
        }
    }
}
