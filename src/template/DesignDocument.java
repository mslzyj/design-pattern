package template;

/**
 * 设计文档抽象类
 */
public abstract class DesignDocument {

    /**
     * 模板方法，final修饰，不能被重写
     */
    final void templateMethod(){
        privacyPolicy();
        documentDescription();
        text();
    }

    void  privacyPolicy(){
        System.out.println("保密条款，此文档只能内部使用。。。");
    }

    void documentDescription(){
        System.out.println("创建文档第一版，版本号。。。");
    }

    /**
     * 正文，具体的子类实现
     */
    abstract void text();
}

