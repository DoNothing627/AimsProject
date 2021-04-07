package hust.soict.globalict.aims.media;

import java.util.ArrayList;

public class CompactDisc extends Disc implements Playable{
     private String artist;
     private ArrayList<Track> tracks;

    public CompactDisc(int length, String directory) {
        super(length, directory);
    }

    public void addTrack()
    {

    }

    public void removeTrack()
    {

    }

    public int getLength()
    {
         return tracks.size();
    }

    public void play()
    {
        for(int i= 0; i< tracks.size(); i++)
            tracks.get(i).play();
    }

    @Override
    public void setTitle(String b) {

    }
}
