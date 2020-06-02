package decorator;

/**
 * 具体配件，电脑包
 * 有两个特性，名称和价格
 */
public class Package  extends Accessories{

    /**
     * 名称：电脑包，价格：80
     */
    private  static final String MOUSE_NAME = "电脑包";
    private  static final float MOUSE_PRICE = 80;

    /**
     * 通过构造方法，将已经选好的套餐传进来，即将notebook对象传进来
     * 并在notebook对象的基础上增加此类锁表示的对象的特性（名称，价格）
     * @param notebook
     */
    Notebook notebook = null;

    public Package(Notebook notebook){
        this.notebook = notebook;
    }

    @Override
    public String name() {
        return notebook.name() +"加一个"+ MOUSE_NAME;
    }

    @Override
    public float price() {
        return notebook.price() + MOUSE_PRICE;
    }
}