import java.util.Scanner;

public class Contador {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o primeiro parâmetro: ");
        int inicio = sc.nextInt();
        System.out.print("Digite o segundo parâmetro: ");
        int fim = sc.nextInt();

        try{
            contar(inicio, fim);
        } catch (ParametrosInvalidosException exception) {
            System.out.println(exception.message);
        }

    }

    static void contar(int parametroUm, int parametroDois) throws ParametrosInvalidosException {
        if (parametroUm > parametroDois) throw new ParametrosInvalidosException();
        else {
            for (int i = 1; i <= (parametroDois - parametroUm); i++) {
                System.out.println("Imprimindo o número " + i);
            }
        }
    }
}
