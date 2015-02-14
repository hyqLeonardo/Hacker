public class ThreeSort
{
    public static void main(String[] args)
    {
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
        int c = Integer.parseInt(args[2]);
        
        int max = Math.max(a, Math.max(b, c));
        int min = Math.min(a, Math.min(b, c));
        int media = a + b + c - max - min;  // God, it's cheat !
        
        System.out.println(max);
        System.out.println(media);
        System.out.println(min);
    }
}