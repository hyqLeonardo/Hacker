// Wow, this is funny ~
public class RandomWalker
{
    public static void main(String[] args)
    {
        int N = Integer.parseInt(args[0]);
        long step = 0;
        // Initiate coordinates.
        int x = 0;
        int y = 0;
        
        while (Math.abs(x) < N && Math.abs(y) < N)
        {
            double prob = Math.random();
            
            if (prob <= 1.0/4)
                x += 1;
            if (prob > 1.0/4 && prob <= 1.0/2)
                y += 1;
            if (prob > 1.0/2 && prob < 3.0/4)
                x -= 1;
            if (prob >= 3.0/4)
                y -= 1;
            
            step += 1;
        }
        
        System.out.println(step);
    }
}