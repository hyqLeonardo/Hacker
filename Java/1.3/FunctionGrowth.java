public class FunctionGrowth
{
    public static void main(String[] args)
    {
        System.out.println("N\t\t\t NlogN\t\t\t N^2\t\t\t N^3\t\t\t 2^N");
        for (int i = 4; i <= 10; i++)
        {
            double N = Math.pow(2, i);
            System.out.println(N + "\t\t\t" + N*Math.log(N) + "\t\t\t"
            + N*N + "\t\t\t" + N*N*N + "\t\t\t" + Math.pow(2, N));
        }
    }
}