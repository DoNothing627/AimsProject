package hust.soict.it2.aims.media;

public abstract class Media {
    protected String title;
    protected String category;
    protected float cost;

    public void getTitle(String title){
        this.title= title;
    }

    public void getCategory(String category){
        this.category= category;
    }

    public void getCost(float cost){
        this.cost= cost;
    }

    public Media(String title){
        this.title = title;
    }
    public Media(String title,
        String category){
        this(title);
        this.category = category;
    }
    
    public boolean equals(Media media) {
		if (this.id == media.id) return true;
		else return false;
	}
}
