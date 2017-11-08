import java.util.List;
import java.util.Scanner;

public class Display {

    TimeTracker timeTracker;
    Scanner input;

    public Display(TimeTracker timeTracker) {
        this.timeTracker = timeTracker;
        input = new Scanner(System.in);
    }


    public void displayEmployee(Employee emp)
    {

    }

    public void displayEmployees(List<Employee> employees)
    {
        for(Employee e : employees)
            displayEmployee(e);
    }

    public void displayEmployeeOptions()
    {
        System.out.println("Press (i) to clock in.\n" +
                "Press (o) to clock out.\n" +
                "Press (p) to change password.\n" +
                "Press (v) to view current payroll information.\n" +
                "Press (l) to log out.\n"
        );
        String selection = input.next();
        switch(selection)
        {
            case "i":
                clockIn();
                break;
            case "o":
                clockOut();
                break;
            case "p":
                changePassword();
                break;
            case "v":
                viewPayroll();
                break;
            case "l":
                logout();
                break;
            default:
                System.out.println("Command not recognized.");
                break;
        }
    }

    private void viewPayroll()
    {
        //logic for viewing payroll info
    }

    private void changePassword()
    {
        //logic for changing password
    }

    public void displayAdminOptions()
    {

    }

    public void displayWelcome()
    {

    }

    public boolean login() {
        String empID, password;
        System.out.print("Please Enter Your Employee ID: ");
        empID = input.next();
        System.out.print("\nPlease Enter Your Password");
        password = input.next();

        int returnCode = timeTracker.Login(empID, password);
        if (returnCode == 1) {
            System.out.println("Login Successful!");
            return true;
        } else
            System.out.println("User name or password is incorrect. Please try again.");
        return false;
    }

    public void logout()
    {
        timeTracker.Logout();
    }

    private void clockIn()
    {
        timeTracker.ClockIn();
        System.out.println("Clocked in at " + System.currentTimeMillis());
    }

    private void clockOut()
    {
        timeTracker.ClockOut();
        System.out.println("Clocked out at " + System.currentTimeMillis());
    }

}