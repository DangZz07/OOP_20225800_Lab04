package hust.soict.vn.aims.store.Store;
import hust.soict.vn.aims.disc.Disc.DigitalVideoDisc;

public class Store {
    private DigitalVideoDisc itemsInStore[] = new DigitalVideoDisc[1000];
    private int qtyInStore = 0;
    
    public void removeDVD(DigitalVideoDisc disc) {
    	int check = 0;
        for (int i = 0; i < qtyInStore; i++) {
            if (itemsInStore[i].equals(disc)) {
                itemsInStore[i] = itemsInStore[qtyInStore - 1];
                itemsInStore[qtyInStore - 1] = null;
                qtyInStore--;
                System.out.println("Removed DVD " + disc.getTitle() + " from the store");
                check = 1;
                break;
                }
        }
        if (check == 0) {
            System.out.println("DVD not found in the store.");
        }

    }

    public void addDVD(DigitalVideoDisc disc) {
        if (qtyInStore < 1000) {
            itemsInStore[qtyInStore++] = disc;
            System.out.println("Added DVD " + disc.getTitle() + " to the store");
        } else {
            System.out.println("The store is full. Cannot add more DVDs.");
        }
    }


}

