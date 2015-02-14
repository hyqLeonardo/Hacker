public class MonteHall
{
    public static void main(String[] args)
    {
        int N = Integer.parseInt(args[0]);
        int door = 0;
        int choice = 0;
        int sum1 = 0;
        int sum2 = 0;
        
        for (int i = 1; i <= N; i++)
        {
            // Don't change door
            
            double rand1 = Math.random() * 3.0;
            if (rand1 <= 1)
                door = 1;
            if (rand1 >= 2)
                door = 3;
            if (rand1 > 1 && rand1 < 2)
                door = 2;
            
            double rand2 = Math.random() * 3.0;
            if (rand2 <= 1)
                choice = 1;
            if (rand2 >= 2)
                choice = 3;
            if (rand2 > 1 && rand2 < 2)
                choice = 2;
            
            if (choice == door)
                sum1 += 1;
            
            // Change door
            
            double rand3 = Math.random() * 3.0;
            if (rand3 <= 1)
                door = 1;
            if (rand3 >= 2)
                door = 3;
            if (rand3 > 1 && rand3 < 2)
                door = 2;
            
            double rand4 = Math.random() * 3.0;
            if (rand4 <= 1)
                choice = 1;
            if (rand4 >= 2)
                choice = 3;
            if (rand4 > 1 && rand4 < 2)
                choice = 2;
            
            if (choice != door)
                sum2 += 1;
        }
        
        double rate1 = (double)sum1 / N * 100;
        double rate2 = (double)sum2 / N * 100;
        
        System.out.println("If don't change, sucess rate: " + Math.round(rate1)
                               + "% " + " if change, then sucess rate: " 
                               + Math.round(rate2) + "%");
    }
}