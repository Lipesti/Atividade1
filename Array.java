import javax.swing.JOptionPane;

public class Array {
    public static void main(String[] args) {
        double[] numeros = new double[5];
        
        for (int i = 0; i < 5; i++) {
            numeros[i] = Double.parseDouble(JOptionPane.showInputDialog("Digite um número: "));
            if (numeros[i] < 0) {
                JOptionPane.showMessageDialog(null, "Número negativo, programa encerrado!");
                break;
            }
        }
        
        StringBuilder resultado = new StringBuilder("Números digitados: \n");
        for (double num : numeros) {
            resultado.append(num).append("\n");
        }
        JOptionPane.showMessageDialog(null, resultado.toString());
    }
}
