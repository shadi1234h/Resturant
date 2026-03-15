public class Order extends Food{
     private int id;
     private Food food;
     int c;

    public Order(String category, String incredients, String name, double price,String notes) {
        super(category, incredients, name, price,notes);
    }


}
