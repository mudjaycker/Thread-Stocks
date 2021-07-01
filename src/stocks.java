public class stocks {
    int quantity;

    public synchronized void ajouter(int qte){
        System.out.println(qte+" a ete ajouter, avant il y'avait "+this.quantity);
        this.quantity +=qte;
        notifyAll();
    }

    public synchronized void retirer(int qte) throws InterruptedException{
        if(this.quantity > qte){
            System.out.println("Avant retrait quantite = "+this.quantity+" on retire "
                                                                    +qte);
            this.quantity-=qte;
            System.out.println("il reste "+this.quantity);

            notifyAll();
        }
        else{ 
            System.out.println("la quantite est trop faible");
            wait();
        }

    }

    
}
