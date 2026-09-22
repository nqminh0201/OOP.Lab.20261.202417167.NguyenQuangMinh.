import javax.swing.JOptionPane;

public class Calculate {
    public static void main(String[] args) {

        String strNum1 = JOptionPane.showInputDialog(
            "Enter the first number:"
        );

        String strNum2 = JOptionPane.showInputDialog(
            "Enter the second number:"
        );

        double num1 = Double.parseDouble(strNum1);
        double num2 = Double.parseDouble(strNum2);

        double sum = num1 + num2;
        double difference = num1 - num2;
        double product = num1 * num2;

        String result;

        if (num2 == 0) {
            result = "Cannot divide by zero.\n"
                   + "Sum = " + sum + "\n"
                   + "Difference = " + difference + "\n"
                   + "Product = " + product;
        } else {
            double quotient = num1 / num2;

            result = "Sum = " + sum + "\n"
                   + "Difference = " + difference + "\n"
                   + "Product = " + product + "\n"
                   + "Quotient = " + quotient;
        }

        JOptionPane.showMessageDialog(
            null,
            result
        );
    }
}