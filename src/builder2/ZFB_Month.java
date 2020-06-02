package builder2;

/**
 * 支付宝最近一月账单
 */
public class ZFB_Month extends ZFB {

    @Override
    public String time() {
        return "最近一月账单:";
    }

    @Override
    public float money() {
        return 3000;
    }
}
