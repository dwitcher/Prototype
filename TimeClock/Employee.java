import java.util.HashMap;

public class Employee {

    private String lastName;
    private String firstName;
    //private String birthDay;
    //private String phoneNumber;
    //private String address;
    private String password;
    private int empId;
    private String lastClockIn;
    private String lastClockOut;
    private boolean isClockedIn;
    private double payRate;
    private double hoursWorked;
    protected int clearanceLevel;
    //Key: Date worked
    //Value: Hours worked w/ respective date appended.
    private HashMap<String, String> dictTimeWorked;

    public Employee()
    {
        //default constructor creates test data for now
        firstName = "Test";
        lastName = "Employee";
        password = "password";
        empId = 0;
        payRate = 7.25;
        clearanceLevel = 0;
        dictTimeWorked = new HashMap<String, String>();
    }

    public String getLastName() {
        return lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getPassword() {
        return password;
    }

    public int getEmpId() {
        return empId;
    }

    public String getLastClockIn() {
        return lastClockIn;
    }

    public String getLastClockOut() {
        return lastClockOut;
    }

    public boolean isClockedIn() {
        return isClockedIn;
    }

    public double getPayRate() {
        return payRate;
    }

    public double getHoursWorked() {
        return hoursWorked;
    }

    public int getClearanceLevel() {
        return clearanceLevel;
    }

    public HashMap<String, String> getDictTimeWorked() {
        return dictTimeWorked;
    }

    public void setInformation()
    {

    }

    public void loadInformation()
    {

    }

    public double calculateSalary()
    {
        double salary = -1.0;

        return salary;
    }

    public void changePassword(String newPassword)
    {
        password = newPassword;
    }

    public String employeePayrolls()
    {
        String payrolls = "";

        return payrolls;
    }

    public void clockIn()
    {
        //very basic clock in for now.
        this.isClockedIn = true;
        this.lastClockIn = "" + System.currentTimeMillis();

    }

    public void clockOut()
    {
        this.isClockedIn = false;
        this.lastClockOut = "" + System.currentTimeMillis();
    }
}
