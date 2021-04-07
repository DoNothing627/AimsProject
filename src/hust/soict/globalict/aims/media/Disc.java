package hust.soict.globalict.aims.media;

public class Disc extends Media{
     private int length;
     private String directory;

    public int getLength() {
        return length;
    }

    public String getDirectory() {
        return directory;
    }

    public Disc(int length, String directory) {
        super();
        this.length = length;
        this.directory = directory;
    }
}
