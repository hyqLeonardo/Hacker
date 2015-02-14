public class CarLoan {
    public static void main(String[] args) {
        double PV = Double.parseDouble(args[0]);
        double Y  = Double.parseDouble(args[1]);
        double R  = Double.parseDouble(args[2]);

        double r = R / 12;    // monthly interest rate
        double n = 12 * Y;         // number of months

        double payment  = (PV * r) / (1 - Math.pow(1+r, -n));
        double interest = payment * n - PV;

        System.out.println("Monthly payments = " + payment);
        System.out.println("Total interest   = " + interest);
    }

}