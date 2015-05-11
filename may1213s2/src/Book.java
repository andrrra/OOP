import java.util.ArrayList;

public class Book extends Document{
	public Book(String name, int pages) {
		super(name, pages);
		// TODO Auto-generated constructor stub
	}
	private ArrayList<Document> chapters;
	public ArrayList<Document> getChapters(){
		return chapters;
	}
	public void setChapters(ArrayList<Document> chapters){
		this.chapters=chapters;
	}
	public String toString(){
		String r = this.getName()+" (" +this.getPages()+")"+"\nContains:";
		for(Document d:chapters){
			r+="\n"+d;
		}
		return r;
	}
	public static void main(String[] args){
		Book b = new Book("All about Stamps", 300);
		Document c = new Document("Stamp Collecting", 15);
		ArrayList<Document> cs = new ArrayList <Document>();
		cs.add(c);
		b.setChapters(cs);
		System.out.print(b);
	}


}
