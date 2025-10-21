package cat.uab.tqs.model;

public class Card 
{

    private String suit;
    private String rank;

    public Card(String suit, String rank) {

        this.suit = suit;
        this.rank = rank;

    }

    public String getSuit()
    {
        return this.suit;
        
    }

    public String getRank()
    {
        return this.rank;
        
    }

    public int getCardValue()
    {
        switch (rank) 
        {
            case "J": case "Q": case "K": return 10;
            case "A": return 11;
            default: return Integer.parseInt(rank); // pasa de string a int
        }


    }
    

    
    
}