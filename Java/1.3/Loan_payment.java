// Based on Coursera -- Introduction to Finance Week 2 Lecture 2.6 and 2.7
// E:\Leo_works\Online Course\Introductory to Finance\Loan-Week 2
public class Loan_payment
{
    public static void main (String[ ] args)
    {
        double PV = Double.parseDouble(args[0]);
        int    n  = Integer.parseInt(args[1]);
        double r  = Double.parseDouble(args[2]);
        
        double PMT = PV / ((1-Math.pow(1/(1+r), n))/r);   //Yearly Payment
        double begin = PV;                                //Beginning Balance
        
        double PV_2 = (double)Math.round(PV*100) / 100;   //Round to 2 decimals
        double PMT_2 = (double)Math.round(PMT*100) / 100;
        
        System.out.println("Initial loan at year 0 is " + PV_2);
        System.out.println("Yearly payment is " + PMT_2);
        System.out.println();
        
        
        // Print title
        System.out.println("Year"+"\t\t"+"Beginning"+"\t\t"+"Yearly"+"\t\t"
                               +"Interest"+"\t\t"+"Principal"); 
        System.out.println("    "+"\t\t"+"Balance  "+"\t\t"+"Payment"+"\t\t"
                               +"        "+"\t\t"+"Payment"); 
        System.out.println();
        
        
        for (int i = 1; i <= n; i++)                      //Year
        {
            double interest = begin * r;
            double prin_pay = PMT - interest;             //Principal Payment
            
            
            // Print Values
            System.out.println(i + "  " +                       "\t\t"+
                    (double)Math.round(begin*100) / 100 + " " + "\t\t"+
                     PMT_2 +                                    "\t\t"+
                    (double)Math.round(interest*100)/100+ " " + "\t\t"+
                    (double)Math.round(prin_pay*100)/100);
            
            begin = begin - prin_pay;
            // Beginning Balance can also be computed by the formula
            // PMT * 1/r * [1 - 1/Math.pow(1+r, n)], and this is a
            // better way to find balance without programming !
        }
    }
}

