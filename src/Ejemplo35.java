import java.util.Scanner;

public class Ejemplo35 {
    public static void main(String[] args) {
        int num,num1,res=1;
        Scanner lector = new Scanner(System.in);
        System.out.println("Ingrese el numero:");
        num = lector.nextInt();
        System.out.println("Para dividir por:");
        num1 = lector.nextInt();
        do
        {
            num=num-num1;
            res++;
        }while(num>num1);
        System.out.println(res);
    }
}
