public class random_mean
{
    public static void main(String[] args)
    {
        int N = Integer.parseInt(args[0]);
        double s = 0.0;
        for (int i = 0; i < N; i++)
        {
            double r = Math.random();
            System.out.println(r);
            s += r;
        }
        System.out.println("mean is " + s/N);
    }
}