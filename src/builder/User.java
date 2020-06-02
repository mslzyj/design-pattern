package builder;

public class User {
    /**
     * 姓名，必填
     */
    private String name;

    /**
     * 年龄，选填
     */
    private int age;

    /**
     * 地址，选填
     */
    private String addr;

    /**
     * 身份证号，必填
     */
    private String idCard;

    /**
     * 性别 1-男，0-女，选填
     */
    private char gender;

    /**
     * 手机号，必填
     */
    private String phoneumber;

    public User(Builder builder) {
        this.name = builder.name;
        this.age = builder.age;
        this.addr = builder.addr;
        this.idCard = builder.idCard;
        this.gender = builder.gender;
        this.phoneumber = builder.phoneumber;
    }

    /**
     * 静态内部类
     */
    public static class Builder{

        private String name;
        private int age;
        private String addr;
        private String idCard;
        private char gender;
        private String phoneumber;

        public Builder(String name, String idCard, String phoneumber) {

            this.name = name;
            this.idCard = idCard;
            this.phoneumber = phoneumber;
        }

        public Builder setAge(int age) {
            this.age = age;
            return this;
        }
        public Builder setAddr(String addr) {
            this.addr = addr;
            return this;
        }

        public Builder setGender(char gender) {
            this.gender = gender;
            return this;
        }

        public User build(){
          return new User(this);
        }
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", addr='" + addr + '\'' +
                ", idCard='" + idCard + '\'' +
                ", gender=" + gender +
                ", phoneumber='" + phoneumber + '\'' +
                '}';
    }
}
