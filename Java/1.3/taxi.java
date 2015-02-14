public class taxi
{
    public static void main(String[] args)
    {
        int N = Integer.parseInt(args[0]);
        
        boolean flag1 = false;
        
        for (int a = 1; a*a*a < N; a++)
        {
            for (int b = 1; b*b*b < N && flag1 == false; b++)
            {
                int x = a*a*a + b*b*b;
                
                if (x == N)
                {
                    flag1 = true;
                    boolean flag2 = false;
                    
                    for (int c = a + 1; c*c*c < N; c++)
                    {
                        for (int d = 1; d*d*d < N && flag2 == false; d++)
                        {
                            int y = c*c*c + d*d*d;
                            
                            if (y == N && c != b)
                            {
                                flag2 = true;
                                
                                System.out.println("The first pair is " + "\t" 
                                                   + a + "  " + b);
                                System.out.println("The second pair is " + "\t"
                                                   + c + "  " + d);
                            }
                        }
                    }
                    
                    if (flag2 == false)
                        System.out.println("Only one pair " + "\t" 
                                                   + a + "  " + b);
                }
            }
        }
        
        if (flag1 == false)
            System.out.println("There's no such pair for " + N);
    }
}