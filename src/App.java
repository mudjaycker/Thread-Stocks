import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        try ( Scanner scanner = new Scanner( System.in ) ) {
            
            System.out.print( "Veuillez saisir la quantite a ajouter: " );
            int ajout = scanner.nextInt();
            
            System.out.print( "Veuillez saisir la quantite a retirer: : " );
            int retrait = scanner.nextInt();

        stocks st = new stocks();
        ThreadRetirer THR = new ThreadRetirer(st, 30, retrait);
        ThreadAjouter THA = new ThreadAjouter(st, 40, ajout);

        THA.start();
        THR.start();
            }
    }
}
