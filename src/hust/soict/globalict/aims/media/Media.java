package hust.soict.globalict.aims.media;

public abstract class Media {
    protected String title;
    protected String category;
    protected float cost;

    public String getTitle() {
        return title;
    }

    public String getCategory() {
        return category;
    }


    public float getCost() {
        return cost;
    }

    public abstract void setTitle(String b);
}
