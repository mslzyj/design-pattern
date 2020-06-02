package builder;

public class Main {
    public static void main(String [] args){
        User user = new User.
                Builder("张三","111111111111111","2222222222").
                setAddr("北京").
                setAge(20).
                setGender('1').
                build();
        System.out.println(user.toString());
    }
}
