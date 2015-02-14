public class Euler_conjecture
{
    public static void main(String[] args)
    {
        for (Long a = 1L; a < 100; a++)
        {
            for (Long b = 1L; b < 100; b++)
            {
                for (Long c = 1L; c < 100; c++)
                {
                    for (Long d = 1L; d < 100; d++)
                    {
                        Long sum = (long)(Math.pow(a, 5) + Math.pow(b, 5) +
                                          Math.pow(c, 5) + Math.pow(d, 5));
                        double test = Math.pow(sum, 1.0/5);

                        if (test == (int)test)
                            System.out.println("Yeah! I proved Euler conjecture " +
                                               a + " " + b + " " + c + " " + d);
                    }
                }
            }
        }
    }
}