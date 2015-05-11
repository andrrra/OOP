import java.util.HashMap;


public class GymSession extends ExerciseSession{
	
	private HashMap<String, Length> machines;

	public GymSession(String type, String place) {
		super(type, place);
		machines = new HashMap<String,Length>(8);
	}
	
	public void addMachine(String name, Length length){
		machines.put(name, length);
	}
	
	public String toString(){
		String s = super.toString();
		s+="\nMachines:";
		for(String m:machines.keySet()){
			s+="\n"+m+" "+machines.get(m);
		}
		return s;
	}
	
}
