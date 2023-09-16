
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.Stack;

public class Pilha {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner scanner;

        Stack pilha = new Stack<>();

        scanner = new Scanner(new File("C:/Users/12116455/IdeaProjects/Tarefa3/frases.txt"));
        while (scanner.hasNextLine()){
            pilha.push(scanner.nextLine());
        }

        System.out.println("Top 10 frases mais buscadas: ");

        for (int i = 0; i < 10; i++) {
            System.out.println(pilha.pop());
        }

        System.out.println();

        System.out.println("Frases restantes");

        while (!pilha.empty()){
            System.out.println(pilha.pop());
        }





    }
}
