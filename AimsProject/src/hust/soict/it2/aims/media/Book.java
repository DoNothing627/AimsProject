public class Book extends Media implements Comparable{
    private List<String> authors= new ArrayList<String>();

    public Book(){

    }

    Book(String title){
        super(title);
    }

    Book(String title, String category){
        super(title, category);
    }
    Book(String title, String category, List<String> authors){
        super(title, category);
        this.authors = authors;
        //TODO: check author condition
    }

    public void addAuthors(String authorName){

    }

    public void removeAuthors(String authorName){

    }

    public int compareTo(Media media){

    }

}
