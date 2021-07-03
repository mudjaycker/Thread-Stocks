import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        try ( Scanner scanner = new Scanner( System.in ) ) {
            
            System.out.print( "Type the quantity to add: " );
            int addedQty = scanner.nextInt();
            
            System.out.print( "Type the quantity to remove : " );
            int removedQtity = scanner.nextInt();

            Stocks st = new Stocks();
            ThreadREmQty THR = new ThreadREmQty(st, 50, removedQtity);
            ThreadAddQty THA = new ThreadAddQty(st, 30, addedQty);

            THA.start();
            THR.start();
        }
    }
}
