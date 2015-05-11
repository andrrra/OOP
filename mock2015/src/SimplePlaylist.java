import java.util.ArrayList;

public class SimplePlaylist extends Video{
	
	private ArrayList<Video> videos;

	public SimplePlaylist(String title, int length, int ageRating) {
		super(title, length, ageRating);
		videos = new ArrayList<Video>();
	}

	public ArrayList<Video> getVideos(){
		return videos;
		
	}
	public void setVideos(ArrayList<Video> videos){
		this.videos=videos;
	}
	public String toString(){
		String r = super.toString()+"\nShowing:";
		for (Video v:videos){
			r+="\n"+v;
		}
		return r;
	}
}
