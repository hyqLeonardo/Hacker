public class Quadratic_robust
{
    public static void main(String[] args)
    {
        double a = Double.parseDouble(args[0]);
        double b = Double.parseDouble(args[1]);
        double c = Double.parseDouble(args[2]);
        double discriminant = b*b - 4.0*a*c;
        if (discriminant >= 0)
        {
            double d = Math.sqrt(discriminant);
            if (a == 0)
                System.out.println("a is zero");
            else
            {
                System.out.println((-b + d) / 2.0);
                System.out.println((-b - d) / 2.0);
            }
        }
        
        else
            System.out.println("discriminant is negative");
    }
}