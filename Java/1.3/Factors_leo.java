public class Factors_leo
{
    public static void main(String[] args)
    {
        long N = Long.parseLong(args[0]);  // Big N need Long type.
        for (long i = 2; i <= N/i; i++)
        {
            if (N % i == 0)
            {
                System.out.print(i + " ");
                N = N/i;
                i = i-1;       // This is crucial to output right result
            }                  // but I don't know if it's appropriate
        }
        System.out.println(N);
    }
}