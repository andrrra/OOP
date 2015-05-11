import java.util.ArrayList;


public class BetterPlaylist extends Video {
	
	private ArrayList<Video> videos = new ArrayList<Video>();

	public BetterPlaylist(String title) {
		super(title,1,2);
	}
	
	public ArrayList<Video> getVideos(){
		return videos;
	}
	
	public void setVideos(ArrayList<Video> videos){
		this.videos=videos;
	}
	
	public String toString(){
		String s=this.getTitle()+" ("+this.getLength()+" mins), R:"+this.getAgeRating()+"\nShowing:";
		for (Video v:videos)
			s+="\n"+v.toString();
		return s;
	}
	
	public int getLength(){
		int s=0;
		for (Video v:videos)
			s+=v.getLength();
		return s;
	}
	
	public int getAgeRating(){
		int max = 12;
		for (Video v:videos)
			max = Math.max(max, v.getAgeRating());
		return max;
	}
	
	

}
