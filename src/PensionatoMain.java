import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class PensionatoMain {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Pensionato[] vect = new Pensionato[10];

        System.out.print("Quantidade de alunos que irão alugar quartos: ");
        int n = sc.nextInt();

        // criando um vetor do tipo "Pensionato"
        Pensionato[] quartos = new Pensionato[n];

        for (int i=1; i<=n; i++) {
            System.out.println("Aluguel #" + i + ":");
            System.out.print("Nome: ");
            sc.nextLine();      // limpa a quebra de linha do buffer
            String nome = sc.nextLine();        // permite ler quando há espaço
            System.out.print("Email: ");
            String email = sc.next();
            System.out.print("Quarto: ");
            int numeroQuarto = sc.nextInt();

            Pensionato pensionato = new Pensionato(nome, email);
            vect[numeroQuarto] = pensionato;        // o numero do quarto refere-se a posiçao do vetor
            //vect[i] = new Pensionato(nome, email, numeroQuarto);
        }

        System.out.println();
        System.out.println("Quartos ocupados: ");
        for (int i=0; i<10; i++) {
            if (vect[i] != null) {
                System.out.println(i + ": " + vect[i]);
            }
        }

        sc.close();
    }
}
