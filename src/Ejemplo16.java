import java.util.Scanner;

public class Ejemplo16 {
    public static void main(String[] args) {
        int num1, num2;
        String Operacion;
        Scanner lector = new Scanner(System.in);

        System.out.println("Introdusca dos numeros y la operacion deseada(+,-,*,/):");
        num1 = lector.nextInt();
        num2 = lector.nextInt();
        Operacion = lector.next();
        switch (Operacion)
        {
            case "+":
                System.out.println("la suma da: " + (num1+num2));
                System.out.printf("La suma da: %d", num1+num2);
                break;
            case "-":
                System.out.printf("La resta da: %d %n", num1 - num2);
                break;
            case "*":
                    System.out.printf("La multiplicacion da: %d %n",num1 * num2);
                    break;
            case "/":
                System.out.printf("La divison da: %d %n ",num1/num2);
                break;
        }
    }
}
