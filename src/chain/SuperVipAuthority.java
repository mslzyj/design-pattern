package chain;

/**
 * 超级会员权限
 */
public class SuperVipAuthority extends Handler{

    /**
     * 调父类构造方法给用户赋予权限
     * 积分在500~1000之间的为超级VIP用户
     */
    public SuperVipAuthority(){
        super(Handler.MARK_MID,Handler.MARK_MAX);
    }

    @Override
    public void out() {
        System.out.println("您可以学习付费大课！");
    }
}
