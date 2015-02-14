public class ExcessiveSpace
{
    public static double H(int N)
    {
        if (N == 1) return 1.0;
        return H(N-1) + 1.0/N;
    }
    
    public static void main(String[] args)
    {
        int N = Integer.parseInt(args[0]);
        System.out.println(H(N));
    }
}