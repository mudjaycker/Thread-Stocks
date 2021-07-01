public class ThreadRetirer extends Thread {
    stocks s;
    int delai;
    int quantity;

    public ThreadRetirer(stocks s, int delai, int quantity) {
        this.s = s;
        this.delai = delai;
        this.quantity = quantity;
    }

    public void run(){
        
        try {
            s.retirer(quantity);
            sleep(delai);

        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    
}
