package decorator;

/**
 * 笔记本抽象类
 * 笔记本有两个特性：名称，价格
 */
public interface Notebook {

    /**
     * 名称
     * @return
     */
    String name();

    /**
     * 价格
     * @return
     */
    float price();

}
