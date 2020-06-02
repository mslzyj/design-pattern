package adapter.adapterObject;

import adapter.sourceAndtarget.TypeC;
import adapter.sourceAndtarget.Y35;

public class TyptCToY35Adapter implements Y35 {

    private TypeC typeC;

    public TyptCToY35Adapter(TypeC typeC){
        this.typeC = typeC;
    }

    @Override
    public void provideY35(){
        typeC.type_C();
        System.out.println("对象转换器：使用转换器转换");
    }
}
