public class Sample
{
    public static void main(String[] args)
    {
        // Print a random sample of M integers
        // from 0 ... N-1 (no duplicates).
        int M = Integer.parseInt(args[0]);
        int N = Integer.parseInt(args[1]);
        int[] perm = new int[N];
        
        // Initialize perm[].
        for (int i = 0; i < N; i++)
            perm[i] = i;
        
        // Take sample.
        for (int j = 0; j < M; j++)
        {
            int t = perm[j];
            int s = j + (int)(Math.random() * (N - j));
            perm[j] = perm[s];
            perm[s] = t;
        }
        
        // Print sample.
        for (int i = 0; i < M; i++)
            System.out.print(perm[i] + " ");
        System.out.println();
    }
                              
}