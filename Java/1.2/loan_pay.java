public class loan_pay
{
    public static void main(String[] args)
    {
        double t = Double.parseDouble(args[0]);
        double P = Double.parseDouble(args[1]);
        double r = Double.parseDouble(args[2]);
        
        double pay = P * Math.exp(r*t);
        
        System.out.println("The loan payment is " + pay);
    }
}