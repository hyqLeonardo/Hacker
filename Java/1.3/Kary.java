// Oh, Yeah ~ !
public class Kary 
{
    public static void main(String[] args)
    {   // n is a number in base 10
        // k is the new base
        int n = Integer.parseInt(args[0]);
        int k = Integer.parseInt(args[1]);
        
        int v = 1;
        
        while (v <= n/k)
            v = v * k;
        
        while (v > 0)
        {
            if (n < v)
                System.out.print(0);
            else
            {
                int t = k-1;
                while (t*v > n)
                    t--;
                
                if (t < 10)
                    System.out.print(t);
                else
                {
                    if (t == 10)
                        System.out.print("A");
                    if (t == 11)
                        System.out.print("B");
                    if (t == 12)
                        System.out.print("C");
                    if (t == 13)
                        System.out.print("D");
                    if (t == 14)
                        System.out.print("E");
                    if (t == 15)
                        System.out.print("F");
                }
                
                n = n - t*v;
            }
            
            v = v / k;
        }
        System.out.println();
    }
}