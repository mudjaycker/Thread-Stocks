import threading
import time
from Stocks import Stocks

from ThreadAddQty import ThreadAddQty
from ThreadRemQty import ThreadRemQty


def main():
    
    toAdd = int(input("Type quantity to be added ==> "))
    toRemove = int(input("Type quantity to be removed ==> "))
    
    s = Stocks()
    thAdd = ThreadAddQty(s, toAdd, 0.03)
    thRemove = ThreadRemQty(s, toRemove, 0.05)
    
    thAdd.start()
    thRemove.start()
    
    thAdd.join()
    thRemove.join()
    
if __name__=="__main__":
    main()