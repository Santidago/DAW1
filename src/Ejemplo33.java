public class Ejemplo33 {
    public static void main(String[] args) {
        double num=1,num2=1,ter,can,golden;
        System.out.print("1");
        for (can=3;can<=40;can++)
        {
            ter=num+num2;
            golden=ter/num2;
            System.out.print(", " + golden);
            num=num2;
            num2=ter;
        }

    }
}
