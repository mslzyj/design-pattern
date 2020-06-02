package proxy.static_proxy;

public class Main {
    public static void main(String [] args) {
        Owner owner = new Owner();
        System.out.println("房东直租");
        owner.rent();
        System.out.println("========================");
        ProxyIntermediary proxyIntermediary = new ProxyIntermediary();
        proxyIntermediary.rent();
    }
}
