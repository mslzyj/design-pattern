package abstract_factory.factory;

import abstract_factory.product.*;

/**
 * 春装工厂类
 */
public class SpringCothingFactory extends  AbstractCothingFactory {

    @Override
    public SpringCothing getSpringCothing(String springWearType) {
        if(null == springWearType) {
            return null;
        }
        if("CHILDER".equalsIgnoreCase(springWearType)){
            return  new ChildrenWearSpringCothing();
        }
        if("YOUTH".equalsIgnoreCase(springWearType)){
            return  new YouthWearSpringCothing();
        }
        if("SENIOR".equalsIgnoreCase(springWearType)){
            return  new SeniorWearSpringCothing();
        }
        return null;
    }

    @Override
    public WinterClothing getWinterCothing(String winterWearType) {
        return null;
    }
}
