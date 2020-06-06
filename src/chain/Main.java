package chain;

public class Main {
    public static void main(String [] args){

        //创建角色对象
        Handler generalAuthority = new GeneralAuthority();
        Handler vipAuthority = new VipAuthority();
        Handler superVipAuthority = new SuperVipAuthority();
        //为当前角色设置下一个角色
        generalAuthority.setNextHandler(vipAuthority);
        vipAuthority.setNextHandler(superVipAuthority);

        System.out.println("张三。。。。。。。。。。。。。");
        IUser user = new User("张三",40);
        generalAuthority.judge(user);

        System.out.println("李四。。。。。。。。。。。。。");
        IUser user2 = new User("李四",600);
        generalAuthority.judge(user2);

    }

}
