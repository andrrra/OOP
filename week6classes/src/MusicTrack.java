/**
 * Created by Andra on 24.02.2015.
 */
public class MusicTrack {
    private String artist = "";
    private String title = "";
    public MusicTrack(String artist, String title){
        this.artist=artist;
        this.title=title;
    }
    public String getArtist(){
        return artist;
    }
    public String getTitle(){
        return title;
    }
    public String toString(){
        return (title + " | " + artist);
    }
}


