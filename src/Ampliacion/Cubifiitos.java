package Ampliacion;

import java.util.HashSet;
import java.util.Scanner;

public class Cubifiitos {
    public static void main(String[] args) {
        int cubo,largo,sac;
        Scanner lector =new Scanner(System.in);
        HashSet<Integer> set = new HashSet<Integer>();
        System.out.println("Inserte un numero");
        String Infi = lector.next();
        do {
            cubo=0;
            largo = Infi.length();
            for (int i = 0;i<largo;i++){
                sac = Integer.parseInt(Infi.substring(i,i+1));
                cubo = cubo +(sac*sac*sac);
            }
            if (set.contains(cubo))
            {
                break;
            }
            set.add(cubo);
            Infi = "0"+cubo;

        }while(cubo!=1);
        if (cubo==1)
        {
            System.out.println("Es cuboinfinito");
        }
        else{
            System.out.println("No es cuboinfinito");
        }
    }
}
