public class Sin
{
    public static void main(String[] args)
    {
        double x = Double.parseDouble(args[0]);
        
        double term = 1.0;
        double sum  = 0.0;
        
        for (int i = 1; sum != sum + term; i += 2)
        {
            if (i == 1)              // Well, this is not very clever, see 
                term = x;            // function Cos.
            else
                term *= (-1) * x*x / ((i-1) * i); 
            sum += term;
        }
        
        System.out.println(sum);
    }
}