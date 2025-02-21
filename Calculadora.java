import java.util.Scanner;

public class Calculadora {
    double numero1;
    double numero2;

    public Calculadora(double numero1, double numero2) {
        this.numero1 = numero1;
        this.numero2 = numero2;
    }

    public double soma() {
        return numero1 + numero2;
    }

    public double subtracao() {
        return numero1 - numero2;
    }

    public double multiplicacao() {
        return numero1 * numero2;
    }

    public double divisao() {
        if (numero2 == 0) {
            System.out.println("Erro: Divisão por zero!");
            return Double.NaN; // Retorna "Not a Number" para indicar um erro
        }
        return numero1 / numero2;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o primeiro número: ");
        double numero1 = scanner.nextDouble();
        System.out.print("Digite o segundo número: ");
        double numero2 = scanner.nextDouble();

        Calculadora calc = new Calculadora(numero1, numero2);

        System.out.println("Escolha a operação:");
        System.out.println("1 - Soma");
        System.out.println("2 - Subtração");
        System.out.println("3 - Multiplicação");
        System.out.println("4 - Divisão");
        System.out.print("Digite o número da operação: "); // Use print para manter na mesma linha
        int opcao = scanner.nextInt();

        switch (opcao) {
            case 1:
                System.out.println("Soma dos números: " + numero1 + " + " + numero2 + " é = " + calc.soma());
                break;
            case 2:
                System.out.println("Subtração dos números: "+ numero1 + " - " + numero2 + "é = " + calc.subtracao());
                break;
            case 3:
                System.out.println("Multiplicação dos números: " + numero1 + " * " + numero2 + " é = " + calc.multiplicacao());
                break;
            case 4:
                System.out.println("Divisão dos numeros: " + numero1 + " / " + numero2 + " é = " + calc.divisao());
                break;
            default:
                System.out.println("Opção inválida!");
        }

        scanner.close();
    }
}
