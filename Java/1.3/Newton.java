public class Newton
{
    public static void main(String[] args)
    {
        int N = Integer.parseInt(args[0]);  // number
        int k = Integer.parseInt(args[1]);  // power
        double epsilon = 1e-15;
        double t = N;
        while (t - N*Math.pow(t, 1-k) > epsilon*t)
        {
            t = ((k-1)*t + N*Math.pow(t, 1-k))/k;
        }
        System.out.println(t);
    }
}