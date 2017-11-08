import java.util.ArrayList;
import java.util.HashMap;

public class TimeTracker
{

    public static HashMap<String, Employee> employees;
    private Display display;
    private boolean keepRunning;
    public static Employee currentlyLoggedIn;

    public TimeTracker()
    {
        employees = new HashMap<String, Employee>();
        display = new Display(this);
        loadData();
    }

    public void run()
    {
        display.displayWelcome();
        keepRunning = true;

        //this needs to be reworked

        while(keepRunning)
        {
            boolean loggedIn = display.login();
            while(!loggedIn)
                loggedIn = display.login();

            while(currentlyLoggedIn != null)
            {
                if(currentlyLoggedIn.getClearanceLevel() >= 5)
                    display.displayAdminOptions();
                else
                    display.displayEmployeeOptions();
            }
        }
    }

    private void loadData()
    {
        //how to load the data?
        //fake data for now
        Employee testEmployee = new Employee();
        employees.put("test", testEmployee);
        Employee testEmployee2 = new Employee();
        employees.put("test2", testEmployee2);
    }

    public static int Login(String empID, String password)
    {
        //Will use the password and id credentials of Employee object to validate login
        Employee temp = employees.get(empID);
        if(temp == null)
            return 500;
        if(password.equals(temp.getPassword()))
        {
            currentlyLoggedIn = temp;
            return 1;
        }
        return 500;
    }

    public static int Logout()
    {
        //Should return user to splash screen?

        currentlyLoggedIn = null;
        return 500;
    }

    public static int ClockIn(Employee pEmployeeInformation)
    {
        return 500;
    }

    public static int ClockIn()
    {
        //logic for clocking in

        currentlyLoggedIn.clockIn();

        return 500;
    }

    public static int ClockOut(Employee pEmployeeInformation)
    {
        return 500;
    }

    public static int ClockOut()
    {

        currentlyLoggedIn.clockOut();
        return 500;
    }

    private static int TimeWorked(Employee pEmployeeInformation)
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

    private static double calculateSalary(Employee pEmployeeInformation)
    {
        return -1;
    }

    private static double changePassword(Employee pEmployeeInformation)
    {
        return -1;
    }

    private static int adjustPayroll(Employee pEmployeeInformation)
    {
        return 500;
    }

    private static int adjustHours(Employee pEmployeeInformation)
    {
        return 500;
    }

    private static String displayEmployeePayrolls()
    {
        return "";
    }
}