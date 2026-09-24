import java.util.Scanner;

public class Ejemplo31 {
    public static void main(String[] args) {
        int num,divi;
        Scanner lector = new Scanner(System.in);
        System.out.println("Ingrese un numero natural");
        num = lector.nextInt();
        if (num > 0)
        {
            for (divi=num;divi > 0;divi--)
            {
                if (num%divi == 0)
                {
                    System.out.println(divi);
                }
            }
        }
        else
        {
            System.out.println("El numero no es natural");
        }
    }
}
