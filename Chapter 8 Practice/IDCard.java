
public class IDCard extends Card
{
    private String idNumber;
    
    public IDCard(String n, String id)
    {
        super(n);
        idNumber = id;
    }
    public String format()
    {
        String zxc = super.format();
        return zxc + "ID Number:" + idNumber;
    }
    
    public boolean equals(Object other)
    {
        if (this.getClass() == other.getClass())
        {
            IDCard otherIDCard = (IDCard) other;
            //check if the superclass determines that this object and the other object are equal
            boolean isEqual = super.equals(otherIDCard);
            //check if the isntance variable sof this object and the other object are equal
            return isEqual && this.idNumber.equals(otherCard.idNumber);
        }
    }
}
