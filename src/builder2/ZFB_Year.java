package builder2;

/**
 * 支付宝最近一年账单
 */
public class ZFB_Year extends  ZFB{
    @Override
    public String time() {
        return "最近一年账单：";
    }

    @Override
    public float money() {
        return 60000;
    }
}
