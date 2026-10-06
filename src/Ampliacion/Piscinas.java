package Ampliacion;

import java.util.Scanner;

public class Piscinas {
    public static void main(String[] args) {
        int npisc,vpisc,nval,vval,nper,vper,nviajes=0,vviajes=0,lleno=0,ganador;
        Scanner lector =new Scanner(System.in);
        System.out.println("Inserte Tamaño de tu piscina de tu valde y lo que perdes de viaje");
        npisc = lector.nextInt();
        nval = lector.nextInt();
        nper = lector.nextInt();
        System.out.println("y los de tu vecino");
        vpisc = lector.nextInt();
        vval = lector.nextInt();
        vper = lector.nextInt();
        do {
            lleno=lleno+nval-nper;
            nviajes++;
            if (lleno<0)
            {
                nviajes=1000000000;
                break;
            }
        }while (npisc>lleno);
        lleno=0;
        do {
            lleno=lleno+vval-vper;
            vviajes++;
            if (lleno<0)
            {
                vviajes=1000000000;
                break;
            }
        }while (vpisc>lleno);
        if (nviajes>vviajes)
        {
            ganador=-1;
            System.out.println(ganador);
        }
        else if (nviajes<vviajes)
        {
            ganador=1;
            System.out.println(ganador);
        }
        else
        {
            ganador=0;
            System.out.println(ganador);
        }


    }
}
