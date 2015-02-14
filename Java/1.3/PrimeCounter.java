public class PrimeCounter
{
    public static void main(String[] args)
    {
        long N = Long.parseLong(args[0]);
        long s = 3;                            // 1, 2, 3 are primer
        
        for (long i = 4; i <= N; i++)
        {
            for (long j = 2; j < i; j++)
            {
                if (i % j == 0)
                    break;
                if (j == i - 1)
                    s += 1;
            }
        }
        
        System.out.println(s);
    }
}