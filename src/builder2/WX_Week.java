package builder2;

/**
 * 微信最近一周账单
 */
public class WX_Week extends WX {

    @Override
    public String time() {
        return "最近一周账单：";
    }

    @Override
    public float money() {
        return 500;
    }
}
