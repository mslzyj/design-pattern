package decorator;

/**
 * 具体配件，键盘
 * 有两个特性，名称和价格
 */
public class Keyboard extends Accessories{

    /**
     * 名称：键盘，价格：100
     */
    private  static final String KEY_BOARD_NAME = "键盘";
    private  static final float KEY_BOARD_PRICE = 100;

    Notebook notebook = null;
    public Keyboard(Notebook notebook){
        this.notebook = notebook;
    }
    @Override
    public String name() {
        return notebook.name() +"加一个"+ KEY_BOARD_NAME;
    }

    @Override
    public float price() {
        return notebook.price() + KEY_BOARD_PRICE;
    }
}
