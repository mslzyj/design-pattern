package strategy;

/**
 * 北京
 */
public class Beijing implements Strategy {

    @Override
    public void  doSomthing() {
        System.out.println("北京逻辑");
    }
}
