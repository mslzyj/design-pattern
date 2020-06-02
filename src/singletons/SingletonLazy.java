package singletons;

/**
 * 懒汉式，线程不安全
 */
public class SingletonLazy {

    private static SingletonLazy  singletonLazy;

    private SingletonLazy(){}

    public static SingletonLazy getSingletonLazy(){
        if(null == singletonLazy){
            singletonLazy = new SingletonLazy();
        }
        return  singletonLazy;
    }

    public void method(){
        System.out.println("非线程安全懒汉:这是单例类的一个普通方法");
    }
}
