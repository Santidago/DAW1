public class Ejemplo29 {
    public static void main(String[] args) {
        int num,div,primo,f;
        div = 3;
        for(num = 3;num < 101;num++)
        {
            primo=num%2;
            if (primo == 1)
            {
                if (div * 2 <= num)
                {
                    primo=num%div;
                    if (primo != 0)
                    {
                        num--;
                        div += 2;
                    }
                    else
                    {
                        div = 3;
                    }
                }
                else
                {
                    System.out.println(num);
                    div = 3;
                }
            }
        }
    }
}
