public class Track implements Playable, Comparable{
    private String title;
    private int length;
    
    public Track(){

    }

    public Track(String title) {
        this.title = title;
    }

    public Track(int length) {
        this.length = length;
    }

    public Track(String title, int length) {
        this.title = title;
        this.length = length;
    }

    public void play(){

    }
}
