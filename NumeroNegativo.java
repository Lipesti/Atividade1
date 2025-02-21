import javax.swing.JOptionPane;
import java.util.ArrayList;
import java.util.List;

public class NumeroNegativo {

    public static void main(String[] args) {
        List<Double> numeros = new ArrayList<>();
        double numeroNegativo = 0; 
        while (true) { 
            try {
                double numero = Double.parseDouble(JOptionPane.showInputDialog("Digite um número:"));

                if (numero < 0) {
                    JOptionPane.showMessageDialog(null, "Número negativo, programa encerrado!");
                    numeros.add(numero); 
                    numeroNegativo = numero;
                    break; 
                } else {
                    numeros.add(numero); 
                }
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Entrada inválida. Digite um número.");
            }
        }

        
        StringBuilder mensagem = new StringBuilder("Números digitados:\n");
        for (double num : numeros) {
            mensagem.append(num).append("\n");
        }
        mensagem.append("\nO número negativo inserido foi: ").append(numeroNegativo).append("\n");
        JOptionPane.showMessageDialog(null, mensagem.toString());
    }
}