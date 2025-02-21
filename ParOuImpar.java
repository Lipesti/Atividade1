import javax.swing.JOptionPane;

public class ParOuImpar {
    public static void main(String[] args) {
        double numero = Double.parseDouble(JOptionPane.showInputDialog("Digite um número: "));

        if (numero % 2 == 0) {
            JOptionPane.showMessageDialog(null, "Número "+ numero +" é par!");
        } else {
            JOptionPane.showMessageDialog(null, "Número "+ numero +" é ímpar!");
        }
    }
}
