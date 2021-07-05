import threading

class Stocks():
    def __init__(self):
        self.quantity = 0
        self.lock = threading.RLock()
        
    
    def addQty(self, qty):
        with self.lock:
            print(f"before adding, quantity was = {self.quantity}")
            self.quantity += qty
            print(f"you added {qty}")
            print(f"after adding it's now = {self.quantity}")
        
    
    def remQty(self, qty):
        with self.lock:
            if(self.quantity > qty):
                print(f"before removing, quantity was = {self.quantity}")
                self.quantity -= qty
                print(f"you removed {qty}")
                print(f"after removing, quantity is now = {self.quantity}")

                
            else:
                print("impossible to remove")  