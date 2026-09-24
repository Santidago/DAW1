package Refuerzos1;

import java.util.Scanner;

public class Ej15 {
    public static void main(String[] args) {
        int num,seg,min=0,hora=0;
        Scanner lector = new Scanner(System.in);
        System.out.println("Inserte tiempo en segundos");
        num = lector.nextInt();
        for (seg = num;seg > 0;)
        {
            if (num>59)
            {
                num-=60;
                min++;
                if (min>59)
                {
                    min-=60;
                    hora++;
                }
            }
            else
            {
                seg=-1;
            }
        }
        System.out.println("El tiempo es "+hora+":"+min+":"+num);
    }
}
