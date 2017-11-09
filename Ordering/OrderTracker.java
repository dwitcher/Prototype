import java.util.ArrayList;
import java.util.List;

public class OrderTracker {
    List<Order> orders;
    private OrderDisplay display;
    private boolean keepRunning;

    public OrderTracker()
    {
        orders = new ArrayList<Order>();
        display = new OrderDisplay(this);
    }

    public void run()
    {
        display.displayWelcome();
        keepRunning = true;
        while(keepRunning)
        {
            display.displayOrderOptions();
        }
    }

    public void createNewOrder()
    {
        //implement later
        Order o = new Order();
        orders.add(o);
    }

    public void removeOrder(int index)
    {
        //implement later
        orders.get(index).deleteRecord();
        orders.remove(index);
    }

    public void loadOrders()
    {

    }

    public void saveOrders()
    {
        
    }
}
