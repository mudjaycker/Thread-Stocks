public class ThreadAddQty extends Thread {
    Stocks s;
    int timing;
    int qty;

    public ThreadAddQty(Stocks s, int timing, int qty) {
        this.s = s;
        this.timing = timing;
        this.qty = qty;
    }

    public void run(){
        
        try {
            s.addQty(qty);
            sleep(timing);
            
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    
}

