
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
}
