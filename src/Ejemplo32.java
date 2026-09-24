public class Ejemplo32 {
    public static void main(String[] args) {
        int num=1,num2=1,ter,can;
        System.out.print("1, 1");
        for (can=3;can<=40;can++)
        {
            ter=num+num2;
            System.out.print(", " + ter);
            num=num2;
            num2=ter;
        }
    }
}
