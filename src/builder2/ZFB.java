package builder2;

public abstract class ZFB implements Bill{

    @Override
    public BillSystem billSystemName() {
        return new System_ZFB_Abstract();
    }
}
