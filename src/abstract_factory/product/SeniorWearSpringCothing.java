package abstract_factory.product;

/**
 * 老年装，春装
 */
public class SeniorWearSpringCothing implements  SpringCothing {

    @Override
    public void productionClothing() {
        System.out.println("老年装，春装");
    }
}
