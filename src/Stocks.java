public class Stocks {
    int quantity;

    public synchronized void addQty(int qty){


        System.out.println("Before adding quantity was = "+this.quantity+
            "\nyou added "+qty);
        this.quantity +=qty;
        System.out.println("after adding quantity is now "+this.quantity);
        notifyAll();

    }

    public synchronized void remQty(int qty) throws InterruptedException{


        if(this.quantity > qty){
            System.out.println("Before removing quantity was = "+this.quantity+
            "\nyou removed "+qty);
            this.quantity-=qty;
            System.out.println("after removing quantity is now "+this.quantity);

            notifyAll();
        }


        else{ 
            System.out.println("Quantity is too low");
            wait();
            }

    }

    
}
