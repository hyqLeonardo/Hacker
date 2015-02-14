public class Binary_Leo  // My version is too redundant
{
    public static void main(String[] args)
    {
        int N = Integer.parseInt(args[0]);
        double n = N;
        int p = 0;
        double v = 0.0;
        
        while (Math.pow(2, p) <= n/2)  
            p++;
        
        v = Math.pow(2, p);  // same computation has been taken in row 10
        n = n - v;
        System.out.print(1);
        
        for (int i = p-1; i >= 0; i--) 
        {
            v = Math.pow(2, i);
            
            if (n < v) 
                System.out.print(0);
            else
            {
                System.out.print(1);
                n = n - v;
            }
            
        }
        System.out.println();
    }
}