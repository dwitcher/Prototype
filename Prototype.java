import java.io.IOException;
import java.awt.*; //url with information found in main method
import java.util.Dictionary;
import java.util.List;
/*
Use milliseconds for
 */
public class Prototype {
    public static void main(String[] args) throws IOException
    {
        //List<cEmployee> lstValidEmployees = retrieveEmployeeData();

        //retrieveEmployeeData(); //TODO: Create text file to serve as pseudo-database for pulling information
        //showSplashScreen(); //using method from http://www.javapractices.com/topic/TopicAction.do?Id=149
        //EventQueue.invokeLater(new SplashScreenCloser());
    }

    /*

     */
    public static int Login(cEmployee pEmployeeInformation)
    {
        //Will use the password and id credentials of cEmployee object to validate login
        return 500;
    }

    public static int Logout()
    {
        //Should return user to splash screen?
        return 500;
    }

    private static int ClockIn(cEmployee pEmployeeInformation)
    {
        return 500;
    }

    private static int ClockOut(cEmployee pEmployeeInformation)
    {
        return 500;
    }

    private static int TimeWorked(cEmployee pEmployeeInformation)
    {
        return 500;
    }

    private static int DisplayManagerCommands()
    {
        return 500;
    }

    private static int DisplayNonManagerCommands()
    {
        return 500;
    }

    private static double calculateSalary(cEmployee pEmployeeInformation)
    {
        return -1;
    }

    private static double changePassword(cEmployee pEmployeeInformation)
    {
        return -1;
    }

    private static int adjustPayroll(cEmployee pEmployeeInformation)
    {
        return 500;
    }

    private static int adjustHours(cEmployee pEmployeeInformation)
    {
        return 500;
    }

    private static String displayEmployeePayrolls()
    {
        return "";
    }
}

class cEmployee extends cAdmin{
    public String lastName;
    public String firstName;
    //public String birthDay;
    //public String phoneNumber;
    //public String address;
    public String password;
    public int empId;
    public String lastClockIn;
    public String lastClockOut;
    public boolean isClockedIn;
    public double payRate;
    public double hoursWorked;
    //Key: Date worked
    //Value: Hours worked w/ respective date appended.
    public Dictionary<String, String> dictTimeWorked;
}

class cAdmin
{

}

class TireOrder
{
    final static double MANDATORY_TIRE_FEE = 10;

}
