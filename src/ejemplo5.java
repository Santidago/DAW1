import java.util.Scanner;
public class ejemplo5 {
    public static void main(String[] args) {
       float num1;
       float num2;
       Scanner lector = new Scanner(System.in);
        System.out.print("Introdusca numero 1 = ");
        num1 = lector.nextFloat();
        System.out.print("Introdusca numero 2 = " );
        num2 = lector.nextFloat();
        //float suma = num1 + num2;
        //float Resta = num1 - num2;
        //float multiplicacion = num1 * num2;
        //float division = num1/num2;
        //System.out.println("La suma de tus numeros es = "+ suma);
        //System.out.println("La resta de tus numeros es = "+ Resta);
        //System.out.println("La multiplicacion de tus numeros es = "+ multiplicacion);
        //System.out.println("La division de tus numeros es = "+ division);
        System.out.println("La suma de tus numeros es = "+ (num1 + num2));
        System.out.println("La suma de tus numeros es = "+ (num1 - num2));
        System.out.println("La suma de tus numeros es = "+ (num1 * num2));
        System.out.println("La suma de tus numeros es = "+ (num1/num2));

    }
}
