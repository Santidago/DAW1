import java.util.Scanner;

public class Ejemplo26 {
    public static void main(String[] args) {
        int num,tabla;
        Scanner lector = new Scanner(System.in);
        System.out.println("Inserte un numero");
        num = lector.nextInt();
        System.out.println("La tabla de multiplicacion de tu numero es:");
        for (tabla = 1; tabla < 11; tabla++ )
        {
            System.out.println(num + " x " + tabla + " = " + (num*tabla));
        }
    }
}
