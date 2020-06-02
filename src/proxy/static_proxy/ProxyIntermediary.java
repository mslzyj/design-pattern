package proxy.static_proxy;

/**
 * 中介代码
 */
public class ProxyIntermediary implements Rent{

    private Owner owner = null;

    @Override
    public void rent() {
      if(owner == null){
          owner = new Owner();
      }
      System.out.println("中介代理开始");
      owner.rent();
    }
}
