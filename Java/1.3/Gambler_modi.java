public class Gambler_modi
{
    public static void main(String[] args)
    {   // "upper" is the most bets the gambler can make
        int stake = Integer.parseInt(args[0]);
        int goal  = Integer.parseInt(args[1]);
        int T     = Integer.parseInt(args[2]);
        int upper = Integer.parseInt(args[3]); 
        int bets = 0;
        int wins = 0;
        for (int t = 0; t < T; t++)
        {
            int cash = stake;
            while ((cash > 0 && cash < goal) && bets < upper)
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