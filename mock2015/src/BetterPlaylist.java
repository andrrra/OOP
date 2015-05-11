import java.util.ArrayList;


public class BetterPlaylist extends Video{
	
	private ArrayList<Video> videos;

	public BetterPlaylist(String title) {
		super(title, 2, 12);
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
	
	public int getLength(){
		int l=0;
		for (Video v:videos){
			l+=v.getLength();
		}
		return l;
		//will return the sum of the lengths of the videos in the playlist.
		//		For example, a playlist containing videos of lengths 117, 147 will return a
		//		length of 264. A playlist with no videos will have a length of 0.
	}
	public int getAgeRating(){
		int max=12;
		for (Video v:videos){
			if (v.getAgeRating()>max) max=v.getAgeRating();
		}
		return max;
		//will return the maximum of the age ratings of the videos in
		//		the playlist. For example, a playlist containing the videos with age ratings
		//		12, 15, 15 will give an age rating of 15. A playlist with no videos will give
		//		an age rating of 12.
	}
	

}
