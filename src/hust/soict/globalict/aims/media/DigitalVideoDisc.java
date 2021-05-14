package hust.soict.globalict.aims.media;


public class DigitalVideoDisc extends Disc implements Playable {
    private int length;

    public DigitalVideoDisc(String title) {
        this.title = title;
    }

    @Override
    public void play() {
        System.out.println("Playing DVD: " + this.getTitle());
        System.out.println("DVD length: " + this.getLength());
    }

    @Override
    public void setTitle(String b) {

    }

    public void setDirector(String string) {
    }

    public void setCost(float f) {
    }

    public void setLength(int i) {
    }
}
