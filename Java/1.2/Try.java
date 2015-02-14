public class Try
{
    public static void main (String[ ] args)
    {
        int a = 0;
        int b = 0;
        int c = 0;
        int d = 0;
        System.out.println ("Num  "+"Square  "+"Num  "+"Square  "+"Num  "+"Square  "+"Num  "+"Square  ");
        for (int x = 1; x<=20; x++) 
        {
            a = x * 1;
            b = 20+a;
            c = 40+a;
            d = 60+a;
            System.out.println (a + "     " + (a * a) + "      " + b + "   " + (b * b) + "      " + c +
             "     " + (c * c) + "      " + d + "     " + (d * d));
         }
    }
}

