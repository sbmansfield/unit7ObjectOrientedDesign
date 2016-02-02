
public class Billfold
{
    private Card card1;
    private Card card2;
    
    public Billfold()
    {
       
    }
    
    public void addCard(Card newcard)
    {
        if (card1 == null)
        {
            card1 = newcard;
        }
        else
        {
            if (card2 == null)
            {
                card2 = newcard;
            }
        }
    }
    
    public String formatCards()
    {
        
        String cards = "["+ card1 + "|" + card2 +"]";
        return cards;
    }
}
