import javax.swing.JOptionPane;

public class GUI_PROGRAM {
    public static void main(String[] args) {
        String name = JOptionPane.showInputDialog("Enter your name:");
        JOptionPane.showMessageDialog(null,"Hello Mr "+name);

        int age = Integer.parseInt(JOptionPane.showInputDialog("Enter your age:"));
        JOptionPane.showMessageDialog(null,"You have lived in this world for "+String.valueOf(age * 365 * 24 * 60 * 60)+" seconds");

        Double height = Double.parseDouble(JOptionPane.showInputDialog("Enter you height in meters:"));
        JOptionPane.showMessageDialog(null, "Your height in centimeters is "+String.valueOf(height * 100));

    }
}




