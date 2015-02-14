public class StdGaussian
{
    public static void main(String[] args)
    {
        double u = Math.random();
        double v = Math.random();
        
        double Z = Math.sin(2*Math.PI*v)*Math.pow(-2*Math.log(u), 1/2);
        
        System.out.println(Z);
    }
}