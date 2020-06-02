package singletons;

/**
 * 饿汉式
 */
public class Singleton {

    private static Singleton  singleton = new Singleton();

    private Singleton(){}

    public static Singleton getSingleton(){
        if(null == singleton){
            singleton = new Singleton();
        }
        return  singleton;
    }

    public void method(){
        System.out.println("线程安全饿汉式:这是单例类的一个普通方法");
    }
}
