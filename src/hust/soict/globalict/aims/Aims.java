import hust.soict.globalict.aims.disc.DigitalVideoDisc;
import hust.soict.globalict.aims.order.Order;

public class Aims {
    public static void main(String[] args)
    {
        Order order= new Order();

        DigitalVideoDisc dvd1= new DigitalVideoDisc("The Lion King");
        dvd1.setCategory("Animation");
        dvd1.setCost(19.95f);
        dvd1.setDirector("Roger Allers");
        dvd1.setLength(87);

        order.addDigitalVideoDisc(dvd1);

        DigitalVideoDisc dvd2= new DigitalVideoDisc("Star Wars");
        dvd2.setCategory("Science Fiction");
        dvd2.setCost(24.95f);
        dvd2.setDirector("George Lucas");
        dvd2.setLength(124);

        order.addDigitalVideoDisc(dvd2);

        DigitalVideoDisc dvd3= new DigitalVideoDisc("Alladin");
        dvd3.setCategory("Animation");
        dvd3.setCost(18.99f);
        dvd3.setDirector("John Musker");
        dvd3.setLength(90);

        order.addDigitalVideoDisc(dvd3);

        System.out.print("Total Cost is: ");
        System.out.println(order.totalCost());
        //System.out.println(order.qtyOrdered());

        order.removeDigitalVideoDisc(dvd2);
        order.display();
    }
}
