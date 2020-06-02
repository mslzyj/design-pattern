package abstract_factory.product;

public class ChilderWearWinterCothing implements WinterClothing {
    @Override
    public void productionClothing() {
        System.out.println("冬装，童装");
    }
}
