package hust.soict.it2.aims.media;

public class CompactDisc extends Disc implements Playable{
    private String artist;
    private ArrayList<Track> tracks= new ArrayList<Track>();
    public CompactDisc(){
        super();
    }
    public void addTrack(){

    }

    public void removeTrack(){

    }

    public float getLength(){
        float ans= 0;
        for (int i = 0; i < tracks.size(); i++) {
            ans+= tracks[i].getLength();
        }
        return ans;
    }

    public void play(){
        for (int i = 0; i < tracks.size(); i++) {
            tracks[i].play();
        }
    }
}
