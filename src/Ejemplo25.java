import java.util.Scanner;

public class Ejemplo25 {
    public static void main(String[] args) {
        int numero,cal=1;
        Scanner lector = new Scanner(System.in);

        System.out.println("Escriba un numero");
        numero = lector.nextInt();

        for (; numero > 0; numero--)
        {
            cal = cal * numero;
        }
        System.out.println("El factorial de tu numero es " + cal);


    }
}
