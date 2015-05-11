import java.util.ArrayList;

public class Table {
	
	private ArrayList<Element> table = new ArrayList<Element>();
	
	public Table(String fn) {
		readFile(fn);
	}
	
	public Table() {
		this("elements.csv");
	}
	
	public void readFile(String fn){
		In file = new In(fn);
		while (!file.isEmpty()){
			String line = file.readLine();
			String[] parts = line.split(",");
			Element e = new Element(parts[0], Integer.parseInt(parts[1]), parts[2], Double.parseDouble(parts[3]));
			table.add(e);
		}
	}
	
	public Element lookup(String sym){
		Element result = null;
		for (Element e:table){
			if (e.getSym().equals(sym)) result = e;
		}
		return result;
	}
	
	public void display(){
		for (Element e:table)
			e.toString();
	}
	
}
