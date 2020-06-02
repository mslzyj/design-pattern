package abstract_factory.product;

/**
 * 青年装，春装
 */
public class YouthWearSpringCothing implements SpringCothing {

    /**
     * 重写方法
     */
    @Override
    public void productionClothing() {
        System.out.println("青年装，春装");
    }
}
