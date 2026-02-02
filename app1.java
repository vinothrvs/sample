import javax.swing.*;
public class app1 extends JFrame{
    app1(){
        JFrame f = new JFrame();
        f.setSize(100,200);
        f.setDefaultCloseOperation(EXIT_ON_CLOSE);
        JLabel l = new JLabel("hello");
    }
    public static void main(String []args){
        app1 a = new app1();
    }
}
