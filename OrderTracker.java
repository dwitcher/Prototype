import java.util.ArrayList;
import java.util.List;

public class OrderTracker {
    List<Order> orders;

    public OrderTracker()
    {
        orders = new ArrayList<Order>();
    }

    public void createNewOrder()
    {
        //implement later
    }

    public void removeOrder()
    {
        //implement later
        int index = 0; //find index to remove?
        orders.get(index).deleteRecord();
        orders.remove(index);
    }
}
