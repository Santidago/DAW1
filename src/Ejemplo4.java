import java.util.Scanner;
public class Ejemplo4 {
    public static void main(String[] args) {

        Scanner lector = new Scanner(System.in);
        float lado;
        float area;
        System.out.print("introdusca lado = ");
        lado = lector.nextFloat();
        area = lado * lado;
        System.out.println("el area es = " + area);
    }
    }
