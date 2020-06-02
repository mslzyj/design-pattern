package abstract_factory.product;

/**
 * 春装，童装
 */
public class ChildrenWearSpringCothing implements SpringCothing{

    /**
     * 重写方法
     */
    @Override
    public void productionClothing() {
       System.out.println("春装，童装");
    }
}
