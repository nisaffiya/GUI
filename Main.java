import javax.swing.*;
class Main {

    public static void main(String[] args) {
        JFrame frame = new JFrame("Register");
        ImageIcon icon = new ImageIcon("C:\\Users\\Anisa\\Downloads\\icon-register.png");
        frame.setIconImage(icon.getImage());
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 300);
        frame.setContentPane(new COMEY ().Register);
        frame.setVisible(true);
    }
}