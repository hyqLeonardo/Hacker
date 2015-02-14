public class Expo
{
    public static void main(String[] args)
    {
        double x = Double.parseDouble(args[0]);
        double s = 1.0;
        double term = 1.0;
        for (int i = 1; s != s + term; i++)
        {
            term *= x/i;
            s += term;
        }
        System.out.println(s);
    }
}