package proxy.static_proxy;

/**
 * 业主直租
 */
public class Owner implements Rent {

    @Override
    public void rent() {
      System.out.println("房子出租完成");
    }
}
