import javax.swing.JOptionPane;

public class NumeroNegativo {

    public static void main(String[] args) {
        double numero = Double.parseDouble(JOptionPane.showInputDialog("Digite um número: "));
        double novoNumero = 0;

        if (numero > 0) {
            for (int i = 0; i < (int) numero; i++) { 
                novoNumero = Double.parseDouble(JOptionPane.showInputDialog("Digite outro número: "));
                if (novoNumero < 0) {
                    JOptionPane.showMessageDialog(null, "Número negativo, programa encerrado!");
                    break;
                    
                }
            }
        } else {
            JOptionPane.showMessageDialog(null, "Número inválido, programa encerrado!");

        }


    }
    
}
