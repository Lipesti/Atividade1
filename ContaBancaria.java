import javax.swing.JOptionPane;

public class ContaBancaria {
    String nome;
    double saldo;
    int numeroConta;

    public ContaBancaria(String nome, double saldo, int numeroConta) {
        this.nome = nome;
        this.saldo = saldo;
        this.numeroConta = numeroConta;
    }

    public void deposito(double valor) {
        saldo += valor;
    }

    public void saque(double valor) {
        if (valor > saldo) {
            JOptionPane.showMessageDialog(null, "Saldo insuficiente!");
        } else {
            saldo -= valor;
        }
    }

    public static void main(String[] args) {
        String nome = JOptionPane.showInputDialog("Digite o nome do titular da conta:");
        double saldo = Double.parseDouble(JOptionPane.showInputDialog("Digite o saldo da conta:"));
        int numeroConta = Integer.parseInt(JOptionPane.showInputDialog("Digite o número da conta:"));

        ContaBancaria conta = new ContaBancaria(nome, saldo, numeroConta);

        boolean continuar = true;
        while (continuar) {
            String[] opcoes = {"Depósito", "Saque", "Sair"};
            int opcao = JOptionPane.showOptionDialog(null, "Escolha uma opção:", "Menu", 
                    JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, opcoes, opcoes[0]);
            
            switch (opcao) {
                case 0:
                    double valorDeposito = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do depósito:"));
                    conta.deposito(valorDeposito);
                    JOptionPane.showMessageDialog(null, nome + "\n Saldo após depósito: " + conta.saldo);
                    break;
                case 1:
                    double valorSaque = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do saque:"));
                    conta.saque(valorSaque);
                    JOptionPane.showMessageDialog(null, "Saldo após saque: " + conta.saldo);
                    break;
                case 2:
                    JOptionPane.showMessageDialog(null, "Obrigado por usar nosso banco. Até mais!");
                    continuar = false;
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opção inválida!");
            }
        }
    }
}
