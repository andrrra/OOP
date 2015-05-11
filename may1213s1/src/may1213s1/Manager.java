package may1213s1;

import java.util.ArrayList;

public class Manager extends Engineer{
	public Manager(String name, int salary) {
		super(name, salary);
		// TODO Auto-generated constructor stub
	}
	private ArrayList<Engineer> team = new ArrayList<Engineer>();
	public ArrayList<Engineer> getTeam() {
		return team;
	}
	public void setTeam(ArrayList<Engineer> team) {
		this.team=team;
	}
	public String toString() {
		String s=this.getName() + " (" + this.getSalary() +")\nManages:";
		for(Engineer e:team)
			s+="\n"+e;
		return s;
	}
	public static void main (String[] args){
		Manager sue = new Manager ("Sue Smith", 30000);
		ArrayList<Engineer> team = new ArrayList <Engineer>();
		Engineer jo = new Engineer ("Jo Bloggs", 15000);
		team.add(jo);
		sue.setTeam(team);
		System.out.println(sue);
	}

}
