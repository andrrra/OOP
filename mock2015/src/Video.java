
public class Video {
	
	private String title; private int length, ageRating;
	
	public Video(String title, int length,int ageRating) {
		this.title=title;
	
		if (ageRating==12 || ageRating==15 || ageRating==18)
			this.ageRating=ageRating;
		else this.ageRating=18;
		
		this.length=length;
	}
	
	public String getTitle() {
		return title;
	}
	public void setTitle(String name) {
		this.title=name;
	}
	public int getLength() {
		return length;
	}
	public void setLength(int length) {
		this.length=length;
	}
	public int getAgeRating() {
		return ageRating;
	}
	public void setAgeRating(int ageRating) {
		if (ageRating==12 || ageRating==15 || ageRating==18)
			this.ageRating=ageRating;
	}
	
	public String toString() {
		return (title+" ("+length + " mins), R:"+ageRating);
	}
	
	public static void main (String[] args){
		Video nou = new Video("Star Trek", 147, 15);
		System.out.println(nou);
		Video video = new Video("foo", 6, 15);
		System.out.println(video);
	}
}
