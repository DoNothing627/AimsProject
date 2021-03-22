public class TestPassingParameter {
    public static void main(String[] args){

        DigitalVideoDisc jungleDVD= new DigitalVideoDisc("jungle");
        DigitalVideoDisc cinderellaDVD= new DigitalVideoDisc("cinderella");

        swap(jungleDVD, cinderellaDVD);
        System.out.println("jungle dvd title: "+ jungleDVD.getTitle());
        System.out.println("cinderella dvd title: "+ cinderellaDVD.getTitle());

        changeTitle(jungleDVD, cinderellaDVD.getTitle());
        System.out.println("jungle dvd title: "+ jungleDVD.getTitle());
    }

    public static void swap(Object a, Object b)
    {
        Object tmp= a;
        a= b;
        b= tmp;
    }

    public static void changeTitle(DigitalVideoDisc a, String b)
    {
        a.setTitle(b);
        //a= new DigitalVideoDisc("an");
    }
}
