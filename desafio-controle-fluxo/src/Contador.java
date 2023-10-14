import java.util.Scanner;

public class Contador {

    public static void main(String[] args) {
        Scanner terminal = new Scanner(System.in);

        System.out.println("Digite um número: ");
        int parametroUm = terminal.nextInt();

        System.out.println("Digite um outro número: ");
        int parametroDois = terminal.nextInt();

        try {
            contador(parametroUm, parametroDois);

        } catch (ParametrosInvalidosException exception) {
            System.out.println("Erro: " + exception);
        }
    }

    static void contador(int parametroUm, int parametroDois) throws ParametrosInvalidosException {

        if (parametroUm > parametroDois) {
            throw new ParametrosInvalidosException();
        }
        int contagem = parametroDois - parametroUm;
        for (int i = 1; i <= contagem; i++) {
            System.out.println("Contagem: " + i);
        }
    }
}