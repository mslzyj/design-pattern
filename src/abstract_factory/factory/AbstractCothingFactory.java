package abstract_factory.factory;

import abstract_factory.product.SpringCothing;
import abstract_factory.product.WinterClothing;

/**
 * 工厂类
 */
public abstract class AbstractCothingFactory {
   public abstract SpringCothing getSpringCothing(String springWearType);
   public abstract WinterClothing getWinterCothing(String winterWearType);
}
