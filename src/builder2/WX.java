package builder2;

public abstract class WX implements Bill {

    @Override
    public BillSystem billSystemName() {
        return new System_WX_Abstract();
    }
}
