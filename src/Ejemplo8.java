import java.util.Scanner;

public class Ejemplo8 {
    public static void main(String[] args) {
        int Edad;

        Scanner lector = new Scanner(System.in);
        System.out.print("Introdusca tu edad = ");
        Edad = lector.nextInt();
        if(Edad >= 18)
        {
            System.out.println("Ya extranas tu niñez?");
        }
        else
        {
            System.out.println("Ansioso por ser adulto?");
        }
    }
}
