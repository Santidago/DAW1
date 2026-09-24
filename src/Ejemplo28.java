import java.util.Scanner;

public class Ejemplo28 {
    public static void main(String[] args) {
        int num,primo,divisor;
        Scanner lector = new Scanner(System.in);

        System.out.println("Introdusca un numero");
        num = lector.nextInt();
        for (divisor = 3;divisor > 2; divisor+=2)
        {
            primo=num%2;
            if (primo == 1)
            {
                if (divisor * 2 <= num)
                {
                    primo = num%divisor;
                    if (primo == 0)
                    {
                        break;
                    }
                }
                else
                {
                    divisor = 0;
                }
            }
            else
            {
                break;
            }
        }
        if(divisor == 2)
        {
            System.out.println(num + " es primo");
        }
        else
        {
            System.out.println(num + " no es primo");
        }
    }
}
