package adapter.adapterInterface;

public abstract class Pay implements Shopping {
    @Override
    public void pay() {
        System.out.println("支付方法");
    }

    @Override
    public void order() {
      //什么也不用写
    }

    @Override
    public String query() {
        //什么也不用写
        return null;
    }
}
