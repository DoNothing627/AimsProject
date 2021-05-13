package hust.soict.it2.aims;
import hust.soict.it2.aims.disc.*;
import hust.soict.it2.aims.order.*;

public class Aims {
    public static void main(String[] args){
        Order anOrder= new Order();

        DigitalVideoDisc dvd= new DigitalVideoDisc("The Lion King");
        dvd.setCategory("Animation");
        dvd.setCost(19.95f);
        dvd.setDirector("Roger Allers");
        dvd.setLength(87);
        anOrder.addDigitalVideoDics(dvd);

        System.out.println(anOrder.totalCost());
    }

    public static void showMenu() {

        System.out.println("Order Management Application: ");
        System.out.println("--------------------------------");
        System.out.println("1. Create new order");
        System.out.println("2. Add item to the order");
        System.out.println("3. Delete item by id");
        System.out.println("4. Display the items list of order");
        System.out.println("0. Exit");
        System.out.println("--------------------------------");
        System.out.println("Please choose a number: 0-1-2-3-4");
        
    }
}
