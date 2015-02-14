public class Pepys
{
    public static void main(String[] args)
    {
        int N = Integer.parseInt(args[0]);
        int count1 = 0;
        int count2 = 0;
        
        
        for (int i = 1; i <= N; i++)
        {
            int time1 = 0;
            for (int j = 1; j <= 6; j++)
            {
                double rand = Math.random() * 6;
                
                if (rand <= 1)
                    time1 += 1;
            }
            
            if (time1 >= 1)
                count1 += 1;
        }
        
        
        for (int i = 1; i <= N; i++)
        {
            int time2 = 0;
            for (int j = 1; j <= 12; j++)
            {
                double rand = Math.random() * 6;
                
                if (rand <= 1)
                    time2 += 1;
            }
            
            if (time2 >= 2)
                count2 += 1;
        }
        
        double rate1 = (double)count1 / N;
        double rate2 = (double)count2 / N;
        
        if (rate1 > rate2)
            System.out.println("First condition is more likely to happen with "
                                 + 100 * rate1 + "% " + "versus " + 
                                 100 * rate2 + " %");
        else
            System.out.println("Second condition is more likely to happen with "
                                 + 100 * rate2 + "% " + "versus " + 
                                 100 * rate1 + " %");
                                
    }
}