package adapter.adapterClass;

import adapter.sourceAndtarget.Y35;

public class Main {

    public static void main(String [] args){
        Y35 y35 = new TyptCToY35Adapter();
        y35.provideY35();
        System.out.println("正常使用3.5mm插孔");
    }
}
