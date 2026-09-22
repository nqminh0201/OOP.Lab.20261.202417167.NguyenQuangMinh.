import javax.swing.JOptionPane;

public class EquationSolver {
    // The first-degree equation with one variable: ax + b = 0
    static void solveLinearEquation() {
        double a = Double.parseDouble(JOptionPane.showInputDialog(null, "Enter a:"));
        double b = Double.parseDouble(JOptionPane.showInputDialog(null, "Enter b:"));

        String result;
        if (a == 0) {
            result = (b == 0) ? "Infinite solutions (any x satisfies the equation)"
                               : "No solution";
        } else {
            double x = -b / a;
            result = "x = " + x;
        }

        JOptionPane.showMessageDialog(null, result, "Linear Equation Result",
                JOptionPane.INFORMATION_MESSAGE);
    }

    // The system of first-degree equations with two variables:
    // a11*x1 + a12*x2 = b1
    // a21*x1 + a22*x2 = b2
    static void solveLinearSystem() {
        double a11 = Double.parseDouble(JOptionPane.showInputDialog(null, "Enter a11:"));
        double a12 = Double.parseDouble(JOptionPane.showInputDialog(null, "Enter a12:"));
        double a21 = Double.parseDouble(JOptionPane.showInputDialog(null, "Enter a21:"));
        double a22 = Double.parseDouble(JOptionPane.showInputDialog(null, "Enter a22:"));
        double b1 = Double.parseDouble(JOptionPane.showInputDialog(null, "Enter b1:"));
        double b2 = Double.parseDouble(JOptionPane.showInputDialog(null, "Enter b2:"));

        double d = a11 * a22 - a21 * a12;
        double d1 = b1 * a22 - b2 * a12;
        double d2 = a11 * b2 - a21 * b1;

        String result;
        if (d != 0) {
            double x1 = d1 / d;
            double x2 = d2 / d;
            result = "x1 = " + x1 + ", x2 = " + x2;
        } else if (d1 == 0 && d2 == 0) {
            result = "Infinite solutions";
        } else {
            result = "No solution";
        }

        JOptionPane.showMessageDialog(null, result, "Linear System Result",
                JOptionPane.INFORMATION_MESSAGE);
    }

    // The second-degree equation with one variable: ax^2 + bx + c = 0
    static void solveQuadraticEquation() {
        double a = Double.parseDouble(JOptionPane.showInputDialog(null, "Enter a:"));
        double b = Double.parseDouble(JOptionPane.showInputDialog(null, "Enter b:"));
        double c = Double.parseDouble(JOptionPane.showInputDialog(null, "Enter c:"));

        String result;
        if (a == 0) {
            result = "Not a quadratic equation (a = 0).";
        } else {
            double delta = b * b - 4 * a * c;
            if (delta > 0) {
                double x1 = (-b + Math.sqrt(delta)) / (2 * a);
                double x2 = (-b - Math.sqrt(delta)) / (2 * a);
                result = "Two roots: x1 = " + x1 + ", x2 = " + x2;
            } else if (delta == 0) {
                double x = -b / (2 * a);
                result = "Double root: x = " + x;
            } else {
                result = "No real root";
            }
        }

        JOptionPane.showMessageDialog(null, result, "Quadratic Equation Result",
                JOptionPane.INFORMATION_MESSAGE);
    }
    public static void main(String[] args) {
        String[] options = {"Linear equation (ax + b = 0)",
                             "Linear system (2 variables)",
                             "Quadratic equation (ax^2 + bx + c = 0)"};

        int choice = JOptionPane.showOptionDialog(null, "Choose the equation to solve:",
                "Equation Solver", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE,
                null, options, options[0]);

        switch (choice) {
            case 0:
                solveLinearEquation();
                break;
            case 1:
                solveLinearSystem();
                break;
            case 2:
                solveQuadraticEquation();
                break;
            default:
                // user closed the dialog without choosing
                break;
        }

        System.exit(0);
    }
}