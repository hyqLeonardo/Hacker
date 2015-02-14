public class Chaos
{
    public static void main(String[] args)
    {
        double r = Double.parseDouble(args[0]);
        double x = 0.01;
        int t = 0;
        int max_time = 1000000000;
        
        while (Math.abs(x - (1-1/r)) > 0.001 && t < max_time)
        {
            t += 1;
            x = r * x * (1 - x);
        }
        
        if (t == max_time) System.out.println("Infinity");
        
        System.out.println("Now, x is " + x);
        System.out.println("Total time is " + t);
    }
}