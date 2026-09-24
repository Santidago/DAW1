import java.util.Scanner;

public class Ejemplo34 {
    public static void main(String[] args) {
        int num,num1,sum=0,mult;
        Scanner lector = new Scanner(System.in);
        System.out.println("Ingrese el numero:");
        num = lector.nextInt();
        System.out.println("Para mutiplicar por:");
        num1 = lector.nextInt();
        for (mult=num1;mult>0;mult--)
        {
            sum=sum+num;
        }
        System.out.println(sum);
    }
}
