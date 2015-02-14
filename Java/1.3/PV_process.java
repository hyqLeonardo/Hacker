public class PV_process
{
    public static void main (String[ ] args)
    {
        double PMT = Double.parseDouble(args[0]);
        int n      = Integer.parseInt(args[1]);
        double r   = Double.parseDouble(args[2]);
        
        double PV = PMT*(1-Math.pow(1/(1+r), n))/r;
        double bank = PV;
        
        System.out.println("initial money in bank is " + PV);
        System.out.println();
        
        for (int i = 1; i <= n; i++)
        {
            bank = bank * (1+r) - PMT;
            System.out.println("left in bank at end of period "+i+" is "+bank); 
        }
    }
}

