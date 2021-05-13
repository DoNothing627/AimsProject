import hust.soict.it2.aims.disc.DigitalVideoDisc;

public class TestPassingParameter{
    public static void main(String [] args){
        DigitalVideoDisc jungle= new DigitalVideoDisc("Jungle");
        DigitalVideoDisc cinderella= new DigitalVideoDisc("Cinderella");

        swap(jungle, cinderella);
        System.out.println(jungle.getTitle());

        changeTitle(jungle, cinderella.getTitle());
        System.out.println(jungle.getTitle()); 
    }

    static void swap(DigitalVideoDisc a, DigitalVideoDisc b){
        /*Object tmp= a;
        a= b;
        b= tmp;*/
        a.setTitle(b.getTitle());
    }

    static void changeTitle(DigitalVideoDisc a, String title){
        String oldtitle= a.getTitle();
        a.setTitle(title);
        a= new DigitalVideoDisc(oldtitle);
    }
}