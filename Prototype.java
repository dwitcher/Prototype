import java.io.IOException;
import java.awt.*; //url with information found in main method
import java.util.Dictionary;
import java.util.List;
/*
Use milliseconds for
 */
public class Prototype {
    public static void main(String[] args) throws IOException {
        //List<cEmployee> lstValidEmployees = retrieveEmployeeData();

        //retrieveEmployeeData(); //TODO: Create text file to serve as pseudo-database for pulling information
        //showSplashScreen(); //using method from http://www.javapractices.com/topic/TopicAction.do?Id=149
        //EventQueue.invokeLater(new SplashScreenCloser());

        TimeTracker timetracker = new TimeTracker();
        timetracker.run();

    }
}