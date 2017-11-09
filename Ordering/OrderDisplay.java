import java.util.List;
import java.util.Scanner;

public class OrderDisplay {

    private OrderTracker orderTracker;
    private Scanner input;

    public OrderDisplay(OrderTracker orderTracker) {
        this.orderTracker = orderTracker;
        input = new Scanner(System.in);
    }


    public void displayOrder(Order order)
    {
        //Console display of each Order's information
    }

    public void displayOrders(List<Order> Orders)
    {
        for(Order o : Orders)
            displayOrder(o);
    }

    public void displayOrderOptions()
    {
        System.out.println("" //todo: add options here
        );
        String selection = input.next();
        switch(selection)
        {
            case " ":
                break;

            default:
                System.out.println("Command not recognized.");
                break;
        }
    }


    public void displayWelcome()
    {
        //Splashscreen information here?
    }

}
