package chain;

/**
 * vip用户权限
 */
public class VipAuthority extends Handler{

    /**
     * 调父类构造方法给用户赋予权限
     * 积分在100~500之间的为VIP用户
     */
    public VipAuthority(){
        super(Handler.MARK_MIN,Handler.MARK_MID);
    }

    @Override
    public void out() {
        System.out.println("您可以学习付费小课！");
    }
}
