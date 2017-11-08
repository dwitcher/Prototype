import org.junit.Assert;
import org.junit.Test;
import org.junit.Before;

public class EmployeeTest {

    Employee e;

    @Before
    public void init()
    {
        e = new Employee();
    }

    @Test
    public void testEmployee()
    {
        Assert.assertEquals(e.getPassword(), "password");
        Assert.assertEquals(e.getFirstName(), "Test");
        Assert.assertEquals(e.getLastName(), "Employee");
        Assert.assertEquals(e.getClearanceLevel(), 0);
        //Assert.assertEquals(e.getLastClockIn(), 0); //fix this
        //Assert.assertEquals(e.getLastClockOut(), 0); //fix this
        Assert.assertEquals(e.getEmpId(), 0);
        Assert.assertEquals(e.getHoursWorked(), 0.0, 0.00000001);
        Assert.assertEquals(e.getPayRate(), 7.25, 0.0000001);
        //Assert.assertEquals(e.getDictTimeWorked(), {}); //fix this?

    }

    @Test
    public void testFunctions()
    {
        //TODO: test these individually later
        //for now, just testing no errors thrown
        e.changePassword("newpassword");
        e.clockIn();
        e.clockOut();
        e.calculateSalary();
        e.employeePayrolls();
        e.isClockedIn();
        e.loadInformation();
        e.setInformation();
    }

    @Test
    public void testChangePassword()
    {
        e = new Employee();
        Assert.assertEquals(e.getPassword(), "password");
        e.changePassword("newpassword");
        Assert.assertEquals(e.getPassword(), "newpassword");
    }

}
