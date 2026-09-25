import java.util.Scanner;

public class Ejemplo36 {
    public static void main(String[] args) {
        int num,restos,b;
        Scanner Lector =new Scanner(System.in);
        System.out.println("Introduce un numero");
        num = Lector.nextInt();
        String Bin="00000000";
        for (b=7;b>-1;b--)
        {
            restos=num%2;
            if (b==7)
            {
                Bin = String.valueOf(restos);
            }
            else
            {
                Bin = Bin + restos;
            }
            num=num/2;
        }
        for (b=7;b>-1;b--)
        {
            System.out.print(Bin.charAt(b));
        }
    }
}
