package singletons;

/**
 * 枚举
 */
public enum  SingletonEnum {

    INSTANCE;

    public void method(){
        System.out.println("枚举:这是单例类的一个普通方法");
    }
}
