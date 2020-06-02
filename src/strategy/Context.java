package strategy;

public class Context {
    private final Strategy strategy;

    public Context(Strategy strategy){
        this.strategy = strategy;
    }

    public void doSomthing(){
        this.strategy.doSomthing();
    }
}
