package builder2;


public class Main {

    public static  void main(String [] args){

        BillBuilder billBuilder = new BillBuilder();
        Item item1 = billBuilder.test1();
        item1.showItems();

        Item item2 = billBuilder.test2();
        item2.showItems();

        Item item3 = billBuilder.test3();
        item3.showItems();
    }
}
