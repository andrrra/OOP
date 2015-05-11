import java.util.ArrayList;
import java.util.HashMap;


public class Molecule {
	
	private HashMap<Element, Integer> structure = new HashMap<Element, Integer>();
	private Table table = new Table();
	
	public void addAtom(String sym, int num){
		Element e = table.lookup(sym);
		structure.put(e, num);
	}
	
	public void addAtom(String sym){
		structure.put(table.lookup(sym), 1);		
	}
	
	public ArrayList<Element> atoms(){
		ArrayList<Element> atoms = new ArrayList<Element>();
		for (Element e : structure.keySet())
			atoms.add(e);
		return atoms;
		}

	public double weight(){
		double s = 0;
		for (Element e : atoms())
			s+=e.getWeight()*structure.get(e);
		return s;
	}
	
}
