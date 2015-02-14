public class Stats5
{
    public static void main(String[] args)
    {
        double a = Math.random();
        double b = Math.random();
        double c = Math.random();
        double d = Math.random();
        double e = Math.random();
        
        double sum = a+b+c+d+e;
        double mean = sum/5;
        double max = Math.max(a, Math.max(b, Math.max(c, Math.max(d, e))));
        double min = Math.min(a, Math.min(b, Math.min(c, Math.min(d, e))));
        
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        System.out.println(e);
        
        System.out.println("mean is " + mean);
        System.out.println("maximum is " + max);
        System.out.println("minmum is " + min);
    }
}