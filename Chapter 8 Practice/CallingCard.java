
public class CallingCard extends Card
{
    private String cardNumber;
    
    public CallingCard(String n, String cardNum, String pin)
    {
        super(n);
        cardNumber = cardNum;
    }
    
    public String format()
    {
        String pin = super.format();
        return pin + "Pin Number:" + cardNumber;
    }
}
