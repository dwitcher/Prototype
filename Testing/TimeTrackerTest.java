import org.junit.Assert;
import org.junit.Test;
import org.junit.Before;

public class TimeTrackerTest {

    static TimeTracker t;

    @Before
    public void init()
    {
        t = new TimeTracker();
    }

    @Test
    public void testTimeTracker()
    {
        Assert.assertNotNull(t.employees);
        Assert.assertNull(t.currentlyLoggedIn);



    }

    @Test
    public void testFunctions() {
        //TODO: test these individually later
        //for now, just testing no errors thrown

        t.Login("test", "password");



    }

    @Test
    public void testLoginOut()
    {
        t = new TimeTracker();
        t.Login("test", "password");
        Assert.assertNotNull(t.currentlyLoggedIn);
        t.Logout();
        Assert.assertNull(t.currentlyLoggedIn);

        t = new TimeTracker();
        t.Login("bean", "burrito");
        Assert.assertNull(t.currentlyLoggedIn);
        t.Logout();
        Assert.assertNull(t.currentlyLoggedIn);
    }

}
