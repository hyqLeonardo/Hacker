public class Factors_modi
{
    public static void main(String[] args)
    {   // Print the prime factors of N.
        long N = Long.parseLong(args[0]);
        long n = N;
        
        for (long i = 2; i <= n/i; i++)
        {   // Test whether i is a factor.
            int j = 0;
            while (n % i == 0)
            {   // Cast out and print i facotrs.
                n /= i;
                j += 1;
            }   // Any factors of n are greater than 1.
            if (j > 0)
                System.out.print(i + " ");
        }
        if (n > 1) System.out.print(n);
        System.out.println();
    }
}