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
        Assert.assertEquals("password", e.getPassword());
        Assert.assertEquals("Test", e.getFirstName());
        Assert.assertEquals("Employee", e.getLastName());
        Assert.assertEquals(0, e.getClearanceLevel());
        Assert.assertEquals("", e.getLastClockIn()); //returning null
        Assert.assertEquals("", e.getLastClockOut()); //returning null
        Assert.assertEquals(0, e.getEmpId());
        Assert.assertEquals(0.0, e.getHoursWorked(), 0.00000001);
        Assert.assertEquals(7.25, e.getPayRate(), 0.0000001);
        Assert.assertNotNull(e.getDictTimeWorked());

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
        Assert.assertEquals("password", e.getPassword());
        e.changePassword("newpassword");
        Assert.assertEquals("newpassword", e.getPassword());
    }

    @Test
    public void testClocking()
    {
        e = new Employee();
        e.clockIn();
        Assert.assertEquals(true, e.isClockedIn());
        Assert.assertNotNull(e.getLastClockIn());
        e.clockOut();
        Assert.assertEquals(false, e.isClockedIn());
        Assert.assertNotNull(e.getLastClockOut());

    }

    @Test
    public void testSalary()
    {
        e = new Employee();
        //Todo: actual salary calculations
        Assert.assertEquals(0.0, e.calculateSalary(), 0.000001);

    }

    @Test
    public void testLoadInfo()
    {
        //todo: figure out how to load information
    }

    @Test
    public void testSetInfo()
    {
        //todo: should we allow setting information after constructor?
    }

}
