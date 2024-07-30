
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {


    public class ParoleDuplicate {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Inserisci il numero di elementi da inserire: ");
            int N = scanner.nextInt();
            scanner.nextLine();  

            Set<String> paroleDistinte = new HashSet<>();
            Set<String> paroleDuplicate = new HashSet<>();

            for (int i = 0; i < N; i++) {
                System.out.print("Inserisci una parola: ");
                String parola = scanner.nextLine();
                if (!paroleDistinte.add(parola)) {
                    paroleDuplicate.add(parola);
                }
            }

            System.out.println("Parole duplicate: " + paroleDuplicate);
            System.out.println("Numero di parole distinte: " + paroleDistinte.size());
            System.out.println("Elenco delle parole distinte: " + paroleDistinte);

            scanner.close();
        }
    }

}