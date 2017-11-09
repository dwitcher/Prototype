public class Order
{
    private String customerName;
    private String address;
    private String email;
    private String creditCard;
    private String requiredInformation;
    //booleans that we can use and then add the price later.  - 10A
    private bool SparkPlugs;
    private bool nitro;
    private bool Rims;
    
    final static double MANDATORY_TIRE_FEE = 10;

    public Order()
    {
        //constructor for new order
    }
    //returns customer info - 10A
    public String getName()
    {
        return customerName;
    }
    
    public String getAddress()
    {
        return address;   
    }
    
    public String getCard()
    {
        return creditCard;   
    }
    
    public String getEmail()
    {
        return email;   
    }
    //ends changes - 10A
    public void updateProfile()
    {
        //not sure what this is for..
        //change card info or name on record - 10A
    }

    public void deleteRecord()
    {
        //does this need to be in here, or the OrderTracker class?
        //why would we delete...returning customers?? - 10A
    }


}
