public class Gambler
{
    public static void main(String[] args)
    {   // Run T experiments that start with $ stake
        // and terminate on $0 or $goal
        int stake = Integer.parseInt(args[0]);
        int goal = Integer.parseInt(args[1]);
        int T    = Integer.parseInt(args[2]);
        int bets = 0;
        int wins = 0;
        for (int t = 0; t < T; t++)
        {
            int cash = stake;
            while (cash > 0 && cash < goal)
            {
                bets++;
                if (Math.random() < 0.5) cash++;
                else                     cash--;
            }
            if (cash == goal) wins++;
        }
        System.out.println(100*wins/T + "% wins");
        System.out.println("Avg # bets: " + bets/T);
    }
}