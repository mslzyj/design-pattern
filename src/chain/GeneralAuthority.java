package chain;

/**
 * 普通用户权限
 */
public class GeneralAuthority extends  Handler{

    /**
     * 调父类构造方法给用户赋予权限
     * 积分在0~100之间的为普通用户
     */
    public GeneralAuthority(){
        super(Handler.MARK_ZORO,Handler.MARK_MIN);
    }

    @Override
    public void out() {
        System.out.println("您可以学习免费课程！");
    }
}
