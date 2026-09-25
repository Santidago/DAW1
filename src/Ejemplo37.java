import java.util.Scanner;

public class Ejemplo37 {
    public static void main(String[] args) {
        int num=0,cant,e=0,conv;
        char b;
        Scanner Lector =new Scanner(System.in);
        System.out.println("Introduce un numero");
        String bin = Lector.next();
        cant=bin.length();
        do {
            b=bin.charAt(e);
            conv = Integer.parseInt(String.valueOf(b));
            num=(int) (num+(conv*Math.pow(2,(cant-e-1))));
            e++;
        }while(e<cant);
        System.out.println(num);
    }
}
