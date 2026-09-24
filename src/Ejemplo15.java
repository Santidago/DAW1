import java.util.Scanner;

public class Ejemplo15 {
    public static void main(String[] args) {
        int nota;
        Scanner lector = new Scanner(System.in);

        System.out.println("Introdusca tu nota");
        nota = lector.nextInt();

        switch (nota)
        {
            case 1:
                System.out.println("Tu nota es Uno");
                break;
            case 2:
                System.out.println("Tu nota es Dos");
                break;
            case 3:
                System.out.println("Tu nota es Tres");
                break;
            case 4:
                System.out.println("Tu nota es Cuatro");
                break;
            case 5:
                System.out.println("Tu nota es Cinco");
                break;
            case 6:
                System.out.println("Tu nota es Seis");
                break;
            case 7:
                System.out.println("Tu nota es Siete");
                break;
            case 8:
                System.out.println("Tu nota es Ocho");
                break;
            case 9:
                System.out.println("Tu nota es Nueve");
                break;
            case 10:
                System.out.println("Tu nota es Dies");
                break;

        }
    }
}
