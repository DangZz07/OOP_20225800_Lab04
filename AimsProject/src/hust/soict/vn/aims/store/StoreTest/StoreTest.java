package hust.soict.vn.aims.store.StoreTest;
import hust.soict.vn.aims.disc.Disc.DigitalVideoDisc;
import hust.soict.vn.aims.store.Store.Store;

public class StoreTest {

	public static void main(String[] args) {
		Store StoreTest = new Store();
        DigitalVideoDisc dvd1 = new DigitalVideoDisc("The Lion King","Animation", "Roger Allers", 87, 19.95f);
        DigitalVideoDisc dvd2 = new DigitalVideoDisc("Star Wars","Science Fiction", "George Lucas", 87, 24.95f);
        DigitalVideoDisc dvd3 = new DigitalVideoDisc("Aladdin", "Animation", 18.99f);
        StoreTest.addDVD(dvd1);
        StoreTest.addDVD(dvd2);
        StoreTest.addDVD(dvd3);
        StoreTest.removeDVD(dvd3);
        

	}

}
