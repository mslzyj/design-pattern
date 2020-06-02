package adapter.adapterInterface;

public interface Shopping {

    /**
     * 下单
     */
    void order();

    /**
     * 查询
     * @return
     */
    String query();

    /**
     * 支付
     */
    void pay();
}
