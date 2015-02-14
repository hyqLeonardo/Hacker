public class RelativelyPrime
{
    public static void main(String[] args)
    {
        int N = Integer.parseInt(args[0]);
        int x = 0;
        int y = 0;
        
        // Print column names
        System.out.print(" " + "\t");
        for (int s = 1; s <= N; s++)
        {
            if (s < 10)
                System.out.print(s + "  ");
            else 
                System.out.print(s + " ");
        }
        System.out.println();
        
        for (int i = 1; i <= N; i++)
        {   // Print row names
            System.out.print(i + "\t");
            
            for (int j = 1; j <= N; j++)
            {
                if (i > j) {x = i; y = j;}
                else       {x = j; y = i;}
        
                while (x % y != 0)
                {   // update value of x and y
                    int t = x;
                    x = y;
                    y = t % y;
                }
                
                if (y == 1)
                    System.out.print("*  ");
                else 
                    System.out.print("   ");
            }
            System.out.println();
        }
    }
}