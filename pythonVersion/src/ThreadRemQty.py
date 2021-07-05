from Stocks import Stocks
import threading
import time



class ThreadRemQty(threading.Thread):

    def __init__(self, s:Stocks, qty:int, t:int):
        self.s = s
        self.qty = qty
        self.t = t
        
        threading.Thread.__init__(self)
        
    def run(self):
        self.s.remQty(self.qty)
        time.sleep(self.t)