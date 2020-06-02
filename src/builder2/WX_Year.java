package builder2;

/**
 * 微信最近一年账单
 */
public class WX_Year extends WX {

    @Override
    public String time() {
        return "最近一年账单：";
    }

    @Override
    public float money() {
        //此处应调相应接口获取，这里写死
        return 30000;
    }
}
