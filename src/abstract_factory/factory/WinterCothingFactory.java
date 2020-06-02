package abstract_factory.factory;

import abstract_factory.product.*;

/**
 * 冬装工厂类
 */
public class WinterCothingFactory extends AbstractCothingFactory {

    @Override
    public SpringCothing getSpringCothing(String springWearType) {
        return null;
    }

    @Override
    public WinterClothing getWinterCothing(String winterWearType) {
        if(null == winterWearType) {
            return null;
        }
        if("CHILDER".equalsIgnoreCase(winterWearType)){
            return  new ChilderWearWinterCothing();
        }
        if("YOUTH".equalsIgnoreCase(winterWearType)){
            return  new YouthWearWinterCothing();
        }
        if("SENIOR".equalsIgnoreCase(winterWearType)){
            return  new SeniorWearWinterCothing();
        }
        return null;
    }
}
