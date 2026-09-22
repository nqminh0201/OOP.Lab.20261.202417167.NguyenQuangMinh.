import javax.swing.JOptionPane;

public class HelloNameDialog {
    public static void main(String[] args) {
        String name = JOptionPane.showInputDialog("What is your name?");
        JOptionPane.showMessageDialog(null, "Hello " + name + "!" );
    }
}