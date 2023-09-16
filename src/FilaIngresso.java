import java.io.File;
import java.io.FileNotFoundException;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;
import java.util.Scanner;
public class FilaIngresso {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner scanner;
        Queue<Integer> fila = new LinkedList<>();

        scanner = new Scanner(new File("C:/Users/12116455/IdeaProjects/Tarefa3/ingressos.txt"));

        System.out.println("Fila VIP: ");
        for (int i = 0; i < 10; i++) {
            System.out.println(scanner.nextLine());
        }

        Random sortear = new Random();
        int tamanhoFila = fila.size();
        int posicaoSorteada= sortear.nextInt(tamanhoFila);

        System.out.println("Pessoa sorteada: ");
        for (int i = 0; i < tamanhoFila; i++) {
            int ingresso = fila.poll();
            if (ingresso == posicaoSorteada){
                System.out.println(ingresso + "sorteado");
            }
            fila.offer(ingresso);

        }
    }
}
