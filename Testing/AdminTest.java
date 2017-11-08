import org.junit.Assert;
import org.junit.Test;
import org.junit.Before;

public class AdminTest {

    Admin e;
    TimeTracker t;

    @Before
    public void init()
    {
        e = new Admin();
        t = new TimeTracker();
    }

    @Test
    public void testAdmin()
    {
        Assert.assertEquals("password", e.getPassword());
        Assert.assertEquals("Test", e.getFirstName());
        Assert.assertEquals("Employee", e.getLastName());
        Assert.assertEquals(5, e.getClearanceLevel());
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
        e.addEmployee(new Employee());
        e.adjustHours();
        e.adjustPayroll();
        e.removeEmployee(0);
    }

    @Test
    public void testRemoveEmployee()
    {
        e = new Admin();
        //todo: right now we add 2 employees in t.loadData()
        //todo: testing for 2 at the moment, change later
        Assert.assertEquals(2, t.employees.size());
        e.removeEmployee(0);
        Assert.assertEquals(1, t.employees.size());

    }

    @Test
    public void testAdjustHours()
    {

    }

    @Test
    public void testAdjustPayroll()
    {

    }

    @Test
    public void testAddEmployee()
    {
        e = new Admin();
        //todo: right now we add 2 employees in t.loadData()
        //todo: testing for 2 at the moment, change later

        Assert.assertEquals(2, t.employees.size());
        e.addEmployee(new Employee());
        Assert.assertEquals(3, t.employees.size());

    }

    @Test
    public void testChangePassword()
    {
        e = new Admin();
        Assert.assertEquals("password", e.getPassword());
        e.changePassword("newpassword");
        Assert.assertEquals("newpassword", e.getPassword());
    }

    @Test
    public void testClocking()
    {
        e = new Admin();
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
        e = new Admin();
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
