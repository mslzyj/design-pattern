package chain;

public class User implements IUser{

    String userName;
    int score;

    public User(String userName,int score){
        this.userName = userName;
        this.score = score;
    }

    @Override
    public String userName() {
        return userName;
    }

    @Override
    public int score() {
        return score;
    }
}
