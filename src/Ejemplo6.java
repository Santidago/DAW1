import java.util.Scanner;

public class Ejemplo6 {
    public static void main(String[] args) {
        double Radio;
        Scanner lector = new Scanner(System.in);
        System.out.print("Introdusca el radio:");
        Radio = lector.nextDouble();

        double Area = Math.PI * Radio * Radio;
        double perimetro = 2 * Math.PI * Radio;

        System.out.println("Tu area es = " + Area);
        System.out.println("Tu perimetro es = " + perimetro);
    }
}
