import java.util.Scanner;

public class Ejemplo10 {
    public static void main(String[] args) {
        int Numero;

        Scanner lector = new Scanner(System.in);
        System.out.print("Introdusca un numero = ");
        Numero = lector.nextInt();
        if(Numero >= 0)
        {
            System.out.println("Sos muy positivo?");
        }
        else
        {
            System.out.println("Por que tan negativo?");
        }
    }
}
