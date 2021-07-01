public class ThreadAjouter extends Thread {
    stocks s;
    int delai;
    int quantity;

    public ThreadAjouter(stocks s, int delai, int quantity) {
        this.s = s;
        this.delai = delai;
        this.quantity = quantity;
    }

    public void run(){
        
        try {
            s.ajouter(quantity);
            sleep(delai);
            
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    
}

