package builder2;

import java.util.ArrayList;
import java.util.List;

public class Item {

    private List<Bill> items = new ArrayList<Bill>();

    public void addItem(Bill bill){
        items.add(bill);
    }

    public float getCost(){
        float cost = 0.0f;
        for (Bill bill : items) {
            cost += bill.money();
        }
        return cost;
    }

    public void showItems(){
        for (Bill bill : items) {
            System.out.println(bill.billSystemName().billSystemName()+" "+bill.time()+""+bill.money());
        }
        System.out.println("总账单："+ this.getCost());
    }
}
