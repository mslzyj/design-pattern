package abstract_factory.factory;

/**
 * 工厂生成器类
 */
public class FactoryProducer {

    public static AbstractCothingFactory getFactory(String choice){
        if(choice.equalsIgnoreCase("SPRING")){
            return new SpringCothingFactory();
        } else if(choice.equalsIgnoreCase("WINTER")){
            return new WinterCothingFactory();
        }
        return null;
    }
}
