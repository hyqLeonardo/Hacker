public class loan_pay_modi
{
    public static void main(String[] args)
    {
        double t = Double.parseDouble(args[0]);
        double P = Double.parseDouble(args[1]);
        double r = Double.parseDouble(args[2]);
        
        for (double i = 1; i <= t*12; i++)
        {
            double remain = P*Math.exp(r*(t-i/12));
            double payed = P * Math.exp(r*t) - remain;
            System.out.println("payed " + payed + "\t" + "remained " + remain);
        }
    }
}