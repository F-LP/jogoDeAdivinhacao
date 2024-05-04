import java.util.Random;
import java.util.Scanner;

public class JogoAdivinhacao {

    public static void main(String[] args) {
        
    Scanner scanner = new Scanner(System.in);
    Random random = new Random();

    System.out.println("Bem vindo ao jogo de Jogo Adivinhacao");
    System.out.println("Estou pensando em um número de 1 a 100.Você consegue adivinhar ? ");

    int numeroAleatorio = random.nextInt(100) + 1;
    int tentativas = 0;
    boolean acertou = false;

    while (! acertou) {
        System.out.print("Digite seu palpite: ");

        int palpite = scanner.nextInt();tentativas++;

        if (palpite == numeroAleatorio) 
        
        {

            System.out.println("Parabens! Você acertou em " + tentativas + " tentativas.");

        }

        else if (palpite < numeroAleatorio) 
        
        {

          System.out.println("O número que estou pensando é maior que " + palpite + ".");

        }
          
        else {

            System.out.println("O número que estou pensando é menor que " + palpite + ".");

        }
    }

    scanner.close();

    }

}