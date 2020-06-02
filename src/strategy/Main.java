package strategy;

public class Main {
    public static void main(String [] agrs){
        Context context = new Context(new Beijing());
        context.doSomthing();

        Context context2 = new Context(new Hebei());
        context2.doSomthing();
    }
}
