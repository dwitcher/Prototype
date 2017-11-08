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
        //Console display of each employee's information
        System.out.println("Employee Name: " + emp.getFirstName() + " " + emp.getLastName());
        System.out.println("--------------------");
        System.out.println("Employee ID: " + emp.getEmpId());
        System.out.println("Password: " + emp.getPassword());
        System.out.println("Pay Rate: " + emp.getPayRate());
        System.out.println("Hours Worked: " + emp.getHoursWorked());
        System.out.println("Clearance Level: " + emp.getClearanceLevel());
        System.out.println("Last Clock In: " + emp.getLastClockIn());
        System.out.println("Last Clock Out: " + emp.getLastClockOut()); //Can be inconsistent with the clock in if the employee is currently logged in
       
        //Print Times worked as well? Can potentially use a foreach or something similar for the dictTimeWorked
        System.out.println("--------------------");
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
        /*  POTENTIAL LOGIC
            1. Verify if they're logged in already (if we want only the logged in user to be able to do so)
            2. If so, require them to enter their current password
            3. Check this entry across the database/dummy data (foreach or logical equivalent w/ boolean flag when found)
            4. If this matches, prompt them to enter a new password (string compare for equality - case sensitive (?))
            5. Validate password with reentry? 
            6. Display confirmation upon successful password change 
        */
    }

    public void displayAdminOptions()
    {

    }

    public void displayWelcome()
    {
        //Splashscreen information here? 
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
