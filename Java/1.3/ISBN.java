// Input must be a 9-digits number.
// The result is a valid 10-digits ISBN.
public class ISBN
{
    public static void main(String[] args)
    {
        int N = Integer.parseInt(args[0]);
        int M = N;
        int sum = 0;
        int first = 0;      // Tell if the first digit of ISBN is 0.
        
        int j = 10;
        
        for (int i = 8; i >= 0; i--)
        {
            int change = (int)Math.pow(10, i);
            int digit = M / change;
            
            if (i == 8)
                first = digit;
            
            System.out.println(i + "  " + M + "  " + digit);
            sum += digit * j;
            M %= change;
            j -= 1;
        }
        
        for (int k = 1; k < 10; k++)
        {
            if ((sum + k) % 11 == 0)
            {
                N = N * 10 + k;
                if (first == 0)
                    System.out.println("0" + N);
                else
                    System.out.println(N);
            }
        }
    }
}