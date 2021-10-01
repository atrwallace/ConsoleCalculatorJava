package calculadoraterminal;
import java.util.Scanner;

public class CalculadoraTerminal {
    double n1;
    double n2;

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        while (true) {
            System.out.println("Digite o símbolo da operação que deseja realizar(+, -, /, *): ");
            String operacao = teclado.next();

            System.out.println("Digite o primeiro número: ");
            double n1 = teclado.nextDouble();

            System.out.println("Digite o segundo número: ");
            double n2 = teclado.nextDouble();

            if (operacao.equals("+")) {
                System.out.println("Seu resultado é: " + (n1 + n2));
            }
            if (operacao.equals("-")) {
                System.out.println("Seu resultado é: " + (n1 - n2));
            }
            if (operacao.equals("/")) {
                System.out.println("Seu resultado é: " + (n1 / n2));
            }
            if (operacao.equals("*")) {
                System.out.println("Seu resultado é: " + (n1 * n2));
            }
            System.out.println("Deseja continuar a realizar operações? (use s/n)");
            String res = teclado.next();
            if (res.equals("s")) {
// beautiful
            } else {
                System.out.println("Obrigado por usar a calculadora");
                System.exit(0);
                                             }
        }
    }
}