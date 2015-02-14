// Look like shit ... way to go ~
// I should be VERY clear of the goal ! !
// The goal is to compute how many times "dead end" happens.
public class SelfAvoidingWalk_Leo
{
    public static void main(String[] args)
    {
        int N = Integer.parseInt(args[0]);
        int T = Integer.parseInt(args[1]);
        boolean[][] a = new boolean[N][N];
        
        int x = N/2, y = N/2;
        int x_c = 0, y_c = 0;
        int step = 0;
        

        while (x >= 0 && x <= N-1 && y >= 0 && y <= N-1)
        {
            step += 1;
            
            for (int t = 0; t < T; t++)
            {
                step += 1;
                double r = Math.random();
                if (r <= 1.0/4)
                    x_c = -1;
                if (r <= 1.0/2 && r > 1.0/4)
                    y_c = 1;
                if (r <= 3.0/4 && r > 1.0/2)
                    x_c = 1;
                if (r > 3.0/4)
                    y_c = 1;
                
                x += x_c;
                y += y_c;
                
                if (x < 0 || x > N-1 || y < 0 || y > N-1)
                    break;
                else
                {
                    if (a[x][y] == false) 
                    {
                        a[x][y] = true;
                        break;
                    }
                    else if (a[x][y] == true)              
                    {
                        x -= x_c;
                        y -= y_c;
                    }
                }
                System.out.println(x + "\t" + y);
            }
        }
        
        System.out.println("The dog is out !");
        
        System.out.println("Total step is " + step);
    }
}