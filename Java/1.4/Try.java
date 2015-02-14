public class Try
{
    public static void main(String[] args)
    {
        String[] suit = {"Clubs", "Diamonds", "Hearts", "Spades"};
        
        String[] rank = 
        {
            "2", "3", "4", "5", "6", "7", "8", "9", "10", 
            "Jack", "Queen", "King", "Ace"
        };
        
        String[] deck = new String[suit.length * rank.length];
        for (int i = 0; i < rank.length; i++)
        {
            for (int j = 0; j < suit.length; j++)
                deck[suit.length*i + j] = rank[i] + " of " + suit[j];
        }
        
        for (int t = 0; t < deck.length; t++)
            System.out.println(deck[t]);
    }
}