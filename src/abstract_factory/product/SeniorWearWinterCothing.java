package abstract_factory.product;

/**
 * 冬装，老年装
 */
public class SeniorWearWinterCothing implements WinterClothing {
    @Override
    public void productionClothing() {
        System.out.println("冬装，老年装");
    }
}
