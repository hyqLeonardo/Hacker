public class PowersOfTwo
{
    public static void main(String[] args)
    {
        int n = Integer.parseInt(args[0]);
        int i = 0;
        int p = 1;
        while (i <= n)
        {
            System.out.println(i + " " + p);
            p = p * 2;
            i = i + 1;
        }
    }
}