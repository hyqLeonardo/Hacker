public class Cos
{
    public static void main(String[] args)
    {
        double x = Double.parseDouble(args[0]);
        
        double term = 1.0;
        double sum  = 0.0;
        
        for (int i = 1; sum != sum + term; i += 2)
        {
            sum += term;
            term *= (-1) * x*x / (i * (i+1));
        }
        
        System.out.println(sum);
    }
}