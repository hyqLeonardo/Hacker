public class GCD
{
    public static void main(String[] args)
    {
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
        int x = 0;
        int y = 0;
        
        if (a > b) {x = a; y = b;}
        else       {x = b; y = a;}
        
        while (x % y != 0)
        {   // update value of x and y
            int t = x;
            x = y;
            y = t % y;
        }
        System.out.println(y);
    }
}