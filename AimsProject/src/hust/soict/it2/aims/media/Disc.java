public class Disc extends Media{
    protected int length;
    protected String director;

    public void getLength(int length){
        this.length= length;
    }

    public void getDirector(String director){
        this.director= director;
    }

    public Disc(){
        super();
    }
}
