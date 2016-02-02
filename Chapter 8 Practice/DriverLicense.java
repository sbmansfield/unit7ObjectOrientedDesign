
public class DriverLicense extends Card
{
    private String expirationYear;
    
    public DriverLicense(String n, String exp_year)
    {
        super(n);
        expirationYear = exp_year;
    }
    
    public String format()
    {
        String test = super.format();
        return test + "Expiration Year:" + expirationYear;
    }
}
