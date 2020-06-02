package builder2;

/**
 * 微信最近一个月消费账单
 */
public class WX_Month  extends  WX {

    @Override
    public String time() {
        return "最近一个月账单：";
    }

    @Override
    public float money() {
        return 2000;
    }
}
