package singletons;

/**
 * 双重检测锁实现单例模式
 */
public class SingletonDouLock {

    private volatile  static SingletonDouLock singletonDouLock;

    private  SingletonDouLock(){}

    public static SingletonDouLock getSingletonDouLock(){
        if(null == singletonDouLock){
            synchronized (SingletonDouLock.class){
                if(null == singletonDouLock){
                    singletonDouLock = new SingletonDouLock();
                }
            }
        }
        return  singletonDouLock;
    }

    public void method(){
        System.out.println("双重检测锁:这是单例类的一个普通方法");
    }
}
