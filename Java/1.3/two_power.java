public class two_power
{
    public static void main(String[] args)
    {
        int N = Integer.parseInt(args[0]);
        long p = 1;
        if (N < 0)
            return;
        else 
        {
            for (int i = 1; i <= N; i++)
            {
                p = p*2;
                System.out.print(p + " ");
            }
        }
        System.out.println();
    }
}