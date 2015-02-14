public class RGBtoCMYK
{
    public static void main(String[] args)
    {
        double r = Double.parseDouble(args[0]);
        double g = Double.parseDouble(args[1]);
        double b = Double.parseDouble(args[2]);
        
        double w = Math.max(r/255, Math.max(g/255, b/255));
        double c = (w-r/255)/w;
        double m = (w-g/255)/w;
        double y = (w-b/255)/w;
        double k = 1-w;
        
        System.out.println("cyan    = " + c);
        System.out.println("magenta = " + m);
        System.out.println("yellow  = " + y);
        System.out.println("black   = " + k);
    }
}