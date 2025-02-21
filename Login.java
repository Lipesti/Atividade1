import  javax.swing.JOptionPane;

public class Login {
    public static void main(String[] args) {
        String usuario = JOptionPane.showInputDialog("Digite o nome de usuário:");
        int senha = Integer.parseInt(JOptionPane.showInputDialog("Digite a senha:"));

        if (usuario.equals("admin") && senha == 1234) {
            JOptionPane.showMessageDialog(null, "Bem-vindo, " + usuario + "!");
        } else {
            JOptionPane.showMessageDialog(null, "Usuário ou senha inválidos!");
        }
    }
}
