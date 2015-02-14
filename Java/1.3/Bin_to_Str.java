public class Bin_to_Str
{
    public static void main(String[] args)
    {
        int N = Integer.parseInt(args[0]);
        String s = "";
        
        for (int n = N; n > 0; n /= 2)
            s = (n % 2) + s;
        
        System.out.println(s);
    }
}