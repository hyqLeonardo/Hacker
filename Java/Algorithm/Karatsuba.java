public class Karatsuba
{
    public static long M(long x, long y, int n)
    {        
        if (n == 1)
            return x * y;
        
        long pow = (long)Math.pow(10, n/2);
        
        long a = (long)Math.round(x / pow);
        long b = x - a * pow;
        long c = (long)Math.round(y / pow);
        long d = y - c * pow;
        
        long step1 = M(a, c, n/2);             // ac
        long step2 = M(b, d, n/2);             // bd
        long step3 = M(a + b, c + d, n/2);     // (a+b)(c+d)
        long step4 = step3 - step2 - step1;    // ad + bc
        
        return (long)Math.pow(10, n) * step1 + pow * step4 + step2;
        
    }
    
    public static void main(String[] args)
    {
        long x = Long.parseLong(args[0]);
        long y = Long.parseLong(args[1]);
        int n  = Integer.parseInt(args[2]);
        
        System.out.println(M(x, y, n));
    }
}
