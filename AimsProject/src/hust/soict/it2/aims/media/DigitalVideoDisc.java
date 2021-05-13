package hust.soict.it2.aims.media;

public class DigitalVideoDisc extends Disc{
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public float getCost() {
        return cost;
    }

    public void setCost(float cost) {
        this.cost = cost;
    }

    public DigitalVideoDisc(String title, String category, String director, int length, float cost) {
        super(title, category);
        this.director = director;
        this.length = length;
        this.cost = cost;
    }

    public DigitalVideoDisc(String title, String category, String director) {
        super(title, category);
        this.director = director;
    }

    public DigitalVideoDisc(String title, String category) {
        super(title);
        this.category = category;
    }

    public DigitalVideoDisc(String title) {
        super(title);
    }

    public DigitalVideoDisc() {
    
    }

    public boolean search(String Title){
        return true;
    }
    
}
