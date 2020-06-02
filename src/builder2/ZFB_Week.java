package builder2;

/**
 * 支付宝最近一周账单
 */
public class ZFB_Week extends ZFB {

    @Override
    public String time() {
        return "最近一周账单:";
    }

    @Override
    public float money() {
        return  300;
    }
}
