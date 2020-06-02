package decorator;

/**
 * 笔记本配件抽象类
 * 起到承上启下作用，给具体的子类配件定义笔记本原本的特性，即品牌名称和价格
 */
public class Accessories implements Notebook {

    @Override
    public String name() {
        return null;
    }

    @Override
    public float price() {
        return 0;
    }
}
