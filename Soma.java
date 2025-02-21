import java.util.Scanner;

// Classe com método main para testar a classe Soma
public class Soma {
    private double numero1;
    private double numero2;
    private double numero3;
    private double numero4;
    private double numero5;

    // Construtor que aceita dois parâmetros
    public Soma(double numero1, double numero2, double numero3, double numero4, double numero5) {
        this.numero1 = numero1;
        this.numero2 = numero2;
        this.numero3 = numero3;
        this.numero4 = numero4;
        this.numero5 = numero5;
        
    }

    // Método para somar os números
    public double soma() {
        return this.numero1 + this.numero2 + this.numero3 + this.numero4 + this.numero5;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o primeiro número: ");
        double numero1 = scanner.nextDouble();
        System.out.print("Digite o segundo número: ");
        double numero2 = scanner.nextDouble();

        System.out.print("Digite o terceiro número: ");
        double numero3 = scanner.nextDouble();
        System.out.print("Digite o quarto número: ");
        double numero4 = scanner.nextDouble();
        System.out.print("Digite o quinto número: ");
        double numero5 = scanner.nextDouble();

        // Cria um objeto da classe Soma
        Soma soma = new Soma(numero1, numero2, numero3, numero4, numero5);

        // Exibe o resultado da soma
        System.out.println("A soma dos números é: " + soma.soma());
    }
}
