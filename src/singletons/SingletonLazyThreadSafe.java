package singletons;

/**
 * 线程安全懒汉
 */
public class SingletonLazyThreadSafe {

    private static  SingletonLazyThreadSafe singletonLazyThreadSafe;

    private  SingletonLazyThreadSafe(){}

    public static synchronized SingletonLazyThreadSafe  getSingletonLazyThreadSafe(){
        if(null == singletonLazyThreadSafe){
            singletonLazyThreadSafe = new SingletonLazyThreadSafe();
        }
        return singletonLazyThreadSafe;
    }

    public void method(){
        System.out.println("线程安全懒汉:这是单例类的一个普通方法");
    }
}
