package adapter.adapterClass;

import adapter.sourceAndtarget.TypeC;
import adapter.sourceAndtarget.Y35;

/**
 * 在某平台买的转换器，实现Y_3_5接口
 */
public class TyptCToY35Adapter extends TypeC implements Y35 {

    /**
     *  提供3.5mm的圆孔插孔
     */
    @Override
    public void provideY35() {
        this.type_C();
        System.out.println("类转换器:使用转换器转换");
    }
}
