import java.util.Scanner;

class App {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número positivo: ");

        int nmr = scanner.nextInt();
        int contador = nmr;
        if (nmr < 0) {
            System.out.println("Número não positivo");
        } else if (nmr == 0) {
            System.out.println(" 0 é divisível por todos os números, menos por ele mesmo.");

        } else {

            System.out.println("Seus divisores são:");
            while (contador >= 1) {

                if (nmr % contador == 0) {
                    System.out.println(contador);
                }
                contador--;
                ;
            }
        }

    }
}