package broCode;

import javax.swing.JOptionPane;
public class javaGui {
    public static void main(String[] args) {
        String name = JOptionPane.showInputDialog("Enter your name");
        int age = Integer.parseInt(JOptionPane.showInputDialog("Enter your age"));
        double weight = Double.parseDouble(JOptionPane.showInputDialog("Enter your weight"));

        JOptionPane.showMessageDialog(null,"Hello " + name);
        JOptionPane.showMessageDialog(null, "Your are "+age +" years old");
        JOptionPane.showMessageDialog(null, "Your weight is "+ weight+" kg");
    }
}
