public class Gambler_leo
{
    public static void main(String[] args)
    {   // Run T experiments starting with stake = cash
        // and terminate on $0 or $goal
        int stake = Integer.parseInt(args[0]);
        int goal  = Integer.parseInt(args[1]);
        int T     = Integer.parseInt(args[2]);
        int total = 0;
        int wins = 0;
        
        for (int i = 0; i < T; i++)
        {
            int cash = stake;
            while (cash > 0 && cash < goal)
            {
                if (Math.random() > 0.5)
                {
                    cash += 1;
                }
                else 
                    cash -= 1;
                
                total += 1;
            }
            
            if (cash == goal) 
                wins += 1;                               
        }
        System.out.println("Average bets made is " + (double) total/T);
        System.out.println((double) 100*wins/T + "% wins"); 
    }
}