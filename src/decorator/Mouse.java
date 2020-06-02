package decorator;

/**
 * 具体配件，鼠标
 * 有两个特性，名称和价格
 */
public class Mouse extends Accessories{

    /**
     * 名称：鼠标，价格：200
     */
    private  static final String MOUSE_NAME = "鼠标";
    private  static final float MOUSE_PRICE = 200;

    Notebook notebook = null;
    public Mouse(Notebook notebook){
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

