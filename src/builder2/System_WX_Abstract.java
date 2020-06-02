package builder2;

/**
 * 微信系统
 */
public  class System_WX_Abstract implements BillSystem {

    @Override
    public String billSystemName() {
        return  "微信";
    }
}
