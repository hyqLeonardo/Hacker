// Take out a paper and write the process down. Use Logic !
// at most 6 compares will be needed, 5 minimum.
public class Median 
{
    public static void main(String[] args)
    {
        int n1 = Integer.parseInt(args[0]);
        int n2 = Integer.parseInt(args[1]);
        int n3 = Integer.parseInt(args[2]);
        int n4 = Integer.parseInt(args[3]);
        int n5 = Integer.parseInt(args[4]);
        
        int big1 = 0;   int big2 = 0;
        int small1 = 0; int small2 = 0;
        int part1 = 0;  int part2 = 0;
        
        int median = 0;
        
        if (n1 >= n2)
        {
            big1 = n1;
            small1 = n2;
        }
        else 
        {
            big1 = n2;
            small1 = n1;
        }
        
        if (n3 >= n4)
        {
            big2 = n3;
            small2 = n4;
        }
        else
        {
            big2 = n4;
            small2 = n3;
        }
        
        if (big1 <= big2)      { part1 = big1; }
        else                   { part1 = big2; }
        
        if (small1 >= small2)  { part2 = small1; }
        else                   { part2 = small2; }
        
        if (part1 == part2)              { median = part1; }
        if (part1 > n5 && part2 < n5)    { median = n5; }
        if (part1 == n5 || part2 == n5)  { median = n5; }
        if (part1 < n5)                  { median = part1; }
        if (part2 > n5)                  { median = part2; }
        
        System.out.println(median);
    }
}