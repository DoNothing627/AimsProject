public class Order {
    private int numbersOrdered= 0;
    private float totalCost= 0;
    public static final int MAX_NUMBERS_ORDERED= 10;

    private DigitalVideoDisc itemOrdered[]= new DigitalVideoDisc[MAX_NUMBERS_ORDERED];

    public int qtyOrdered(){
        return numbersOrdered;
    }

    public void addDigitalVideoDisc(DigitalVideoDisc Item){
        itemOrdered[numbersOrdered]= Item;
        ++numbersOrdered;
        totalCost+= Item.getCost();
        //System.out.println(Item.getCost());
    }
    public void removeDigitalVideoDisc(DigitalVideoDisc Item){
        totalCost-= Item.getCost();
        for(int i= 0; i< itemOrdered.length; ++i){
            if(itemOrdered[i]== Item)
                itemOrdered[numbersOrdered- 1]= itemOrdered[i];
        }
        --numbersOrdered;
    }

    public void display()
    {
        for(int i= 0; i< numbersOrdered; i++)
            System.out.println(itemOrdered[i].getTitle());
    }

    public float totalCost(){
        return totalCost;
    }
}
