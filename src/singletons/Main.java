package singletons;

import java.util.Random;

public class Main {
    public static  void main(String [] args){

        Integer orderId = new Random().nextInt(10);
        System.out.println(orderId);
        //1.懒汉式，线程不安全
        SingletonLazy singletonLazy = SingletonLazy.getSingletonLazy();
        singletonLazy.method();

        //2.懒汉式，线程安全
        SingletonLazyThreadSafe singletonLazyThreadSafe =
                SingletonLazyThreadSafe.getSingletonLazyThreadSafe();
        singletonLazyThreadSafe.method();

        //3.线程安全饿汉式
        Singleton singleton = Singleton.getSingleton();
        singleton.method();

        //4.双重检测锁
        SingletonDouLock singletonDouLock = SingletonDouLock.getSingletonDouLock();
        singletonDouLock.method();

        //静态内部类
        SingletonStaticInnerClass singletonStaticInnerClass = SingletonStaticInnerClass.getSingletonStaticInnerClass();
        singletonStaticInnerClass.method();

        //枚举
        SingletonEnum.INSTANCE.method();

    }
}
