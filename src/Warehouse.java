import java.util.HashMap;

public class Warehouse {
    HashMap<Food,Integer>K=new HashMap<>();
    private Food food;
    int numberOfFood;
    int maxcapacity;
    public synchronized  void capacity(int numberOfFood, int maxcapacity){
        if (numberOfFood>maxcapacity){
           throw new RuntimeException("failed");
        }
         K.put(food,0);
    }

    public Warehouse(int maxcapacity) {
        this.maxcapacity = maxcapacity;

    }
}
