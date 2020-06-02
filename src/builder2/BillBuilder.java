package builder2;

/**
 * 构建复杂情况类
 */
public class BillBuilder {

    /**
     * 微信最近一周账单
     * 支付宝最近一个月账单
     * @return
     */
    public Item test1 (){
        Item item = new Item();
        item.addItem(new WX_Week());
        item.addItem(new ZFB_Month());
        return item;
    }

    /**
     * 微信最近一年账单
     * 支付宝最近一周账单
     * @return
     */
    public Item test2 (){
        Item item = new Item();
        item.addItem(new WX_Year());
        item.addItem(new ZFB_Week());
        return item;
    }


    /**
     * 支付宝最近一周账单
     * 支付宝最近一月账单
     * @return
     */
    public Item test3 (){
        Item item = new Item();
        item.addItem(new ZFB_Week());
        item.addItem(new ZFB_Month());
        return item;
    }
}
