public class ThreadREmQty extends Thread {
    Stocks s;
    int timing;
    int qty;

    public ThreadREmQty(Stocks s, int timing, int qty) {
        this.s = s;
        this.timing = timing;
        this.qty = qty;
    }

    public void run(){
        
        try {
            s.remQty(qty);
            sleep(timing);

        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    
}
