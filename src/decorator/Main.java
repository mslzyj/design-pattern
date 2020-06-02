package decorator;

public class Main {
    public static void main(String [] args){

        /**
         * 买ThinkPad
         */
        Notebook notebook = new ThinkPad();
        System.out.println(notebook.name()+"价格:"+notebook.price()+"元;");
        //加一个键盘
        notebook = new Keyboard(notebook);
        System.out.println(notebook.name()+"价格:"+notebook.price()+"元;");
        //再加一个电脑包
        notebook = new Package(notebook);
        System.out.println(notebook.name()+"价格:"+notebook.price()+"元;");
        System.out.println("==========================================");
        /**
         * 买华为
         */
        Notebook notebook1 = new HuaWei();
        System.out.println(notebook1.name()+"价格:"+notebook1.price()+"元;");
        //加一个电脑包
        notebook1 = new Package(notebook1);
        System.out.println(notebook1.name()+"价格:"+notebook1.price()+"元;");
        //再加一个鼠标
        notebook1 = new Mouse(notebook1);
        System.out.println(notebook1.name()+"价格:"+notebook1.price()+"元;");
    }
}
