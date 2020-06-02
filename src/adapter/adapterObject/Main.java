package adapter.adapterObject;

import adapter.sourceAndtarget.TypeC;
import adapter.sourceAndtarget.Y35;

public class Main {

    public static void main(String [] args){
        TypeC typeC = new TypeC();
        Y35 y35 = new TyptCToY35Adapter(typeC);
        y35.provideY35();
        System.out.println("正常使用3.5mm插孔");
    }
}
