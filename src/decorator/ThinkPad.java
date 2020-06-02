package decorator;

/**
 * ThinkPad 笔记本
 */
public  class ThinkPad implements Notebook {

    @Override
    public String name() {
        return "ThinkPad笔记本裸机";
    }

    /**
     * 裸机价格 5000
     * @return
     */
    @Override
    public float price() {
        return 5000;
    }
}
