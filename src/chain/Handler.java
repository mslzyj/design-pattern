package chain;

/**
 * 抽象处理类
 */
public abstract class Handler {

    /**
     * 会员权限等级划分界限
     */
    public static final int MARK_ZORO = 0;
    public static final int MARK_MIN = 100;
    public static final int MARK_MID = 500;
    public static final int MARK_MAX = 1000;

    private int numStart = 0;
    private int numEnd = 0;
    /**
     * 这个属性在具体角色中使用，代表当前角色的下一个处理角色
     */
    private Handler nextHandler;

    public void setNextHandler(Handler nextHandler) {
        this.nextHandler = nextHandler;
    }

    public Handler getNextHandler() {
        return nextHandler;
    }

    /**
     * 此构造方法为了让角色赋值
     * @param numStart
     * @param numEnd
     */
    public Handler(int numStart, int numEnd) {
        this.numStart = numStart;
        this.numEnd = numEnd;
    }

    /**
     * 判断方法
     * 进来一个用户，判断该用户可以学习哪些课程
     */
    public final void judge(IUser user){
        /**用当前用户（this代表的角色）的积分依次和各个角色的要求对比，
        * 如果在该角色的处理范围内，则调此角色的提示方法
        */
         if(user.score() > this.numStart){
            this.out();
            //如果当前角色还有下一个角色，并且用户积分比当前角色能处理的范围大，则让一下角色处理
            if(null != this.getNextHandler() && user.score() > this.numEnd){
                this.getNextHandler().judge(user);
            }
        }
    }

    /**
     * 抽象方法，子类实现，每个子类的具体处理逻辑,在这只是给用户提示
     */
    public abstract void out();
}
