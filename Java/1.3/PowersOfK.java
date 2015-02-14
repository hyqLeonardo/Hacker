public class PowersOfK
{
    public static void main(String[] args)
    {
        int k  = Integer.parseInt(args[0]);
        long r = 0;
        
        for (int i = 1; r < Long.MAX_VALUE; i++) 
        {   // Can't use r <= Long ... , infinite loops
            r = (long)Math.pow(k, i);
            System.out.println(r);
        }
    }
}