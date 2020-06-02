package builder2;

/**
 * 支付宝系统
 */
public  class System_ZFB_Abstract implements BillSystem{

    @Override
    public String billSystemName() {
        return  "支付宝";
    }
}
