public class sphere
{
    public static void main(String[] args)
    {
        double a = 0;
        double b = 0;
        double x = 0;
        double y = 0;
        double z = 0;
        
        do
        {
            a = 2.0 * Math.random() - 1.0;
            b = 2.0 * Math.random() - 1.0;
        } while (Math.sqrt(a*a + b*b) > 1.0);
        
        x = 2 * a * Math.sqrt(1 - a*a - b*b);
        y = 2 * b * Math.sqrt(1 - a*a - b*b);
        z = 1 - 2 * (a*a + b*b);
            
        System.out.println(x + "  " + y + "  " + z);
        double distance = x * x + y * y + z * z;
        System.out.println("distance to sphere center is " + distance);
    }
}