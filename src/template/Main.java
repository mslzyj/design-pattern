package template;

public class Main {
    public static void main(String [] args){
        DesignDocument designDocument = new OrderDemand();
        designDocument.templateMethod();
        System.out.println("========================");
        DesignDocument designDocument1 = new PaymentDemand();
        designDocument1.templateMethod();
    }
}
