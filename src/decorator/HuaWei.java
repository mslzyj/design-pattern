package decorator;

/**
 * 华为笔记本
 */
public class HuaWei  implements Notebook {

    @Override
    public String name() {
        return "华为笔记本裸机";
    }

    /**
     * 裸机价格 6000
     * @return
     */
    @Override
    public float price() {
        return 6000;
    }
}