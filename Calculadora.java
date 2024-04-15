package OO5Sobrecarga;

import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {

        //Entrada
        Scanner teclado = new Scanner(System.in);
        int continuar;

        do {
            System.out.println("Digite a operação:\n"
                    + "1-adição dois valores inteiros\n"
                    + "2-subtração\n"
                    + "3-multiplicação\n"
                    + "4-divisão\n"
                    + "5-exponenciação\n"
                    + "6-fatorial\n"
                    + "7-adição três valores\n"
                    + "8-adição dois valores texto\n");
            int tipo = teclado.nextInt();
            System.out.println("Digite o valor 1:");
            int valor1 = teclado.nextInt();
            int valor2 = 0;
            if (tipo != 6) {
                System.out.println("Digite o valor 2");
                valor2 = teclado.nextInt();
            }

            //Processamento e Saída
            Operacao operacao = new Operacao();

            switch (tipo) {
                //passagens de parametros retornados por função
                case 1:
                    System.out.println("Adição 2 valores inteiros = " + operacao.soma(valor1, valor2));
                    break;
                //passagem por método e retornado por função
                case 2:
                    operacao.setMinuendo(valor1);
                    operacao.setSubtraendo(valor2);
                    System.out.println("Subtração = " + operacao.subtracao());
                    break;
                case 3:
                    operacao.setNumeroGenerico1(valor1);
                    operacao.setNumeroGenerico2(valor2);
                    System.out.println("Multiplicação = " + (valor1 * valor2));
                    break;
                case 4:
                    operacao.setNumeroGenerico1(valor1);
                    operacao.setNumeroGenerico2(valor2);
                    System.out.println("Divisão = " + (valor1 / valor2));
                    break;
                case 5:
                    operacao.setNumeroGenerico1(valor1);
                    operacao.setNumeroGenerico2(valor2);
                    System.out.println("Exponenciação = " + operacao.exponenciacao());
                    break;
                //passagem por método e retornado por função
                case 6:
                    operacao.setFatorial(valor1);
                    System.out.println("Fatorial = " + operacao.getFatorial());
                    break;
                //sobrecarga soma
                case 7:
                    System.out.println("Digite o valor 3:");
                    int valor3 = teclado.nextInt();
                    System.out.println("Adição 3 valores = " + operacao.soma(valor1, valor2, valor3));
                    break;
                case 8:
                    System.out.println("Adição 2 valores texto = " + operacao.soma(Integer.toString(valor1), Integer.toString(valor2)));
                    break;
            }

            System.out.println("Deseja realizar outra operação (1 para sim, 0 para não)");
            continuar = teclado.nextInt();

        } while (continuar == 1);

        teclado.close();
    }
}
