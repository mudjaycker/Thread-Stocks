
    public class App {
    public static void main(String[] args) throws Exception {
        Stocks st = new Stocks();
        ThreadREmQty THR = new ThreadREmQty(st, 50, 12);
        ThreadAddQty THA = new ThreadAddQty(st, 30, 500);

        THA.start();
        THR.start();
    }
}
