package may1213s1;

public class InvestigateLens {
	
	public static boolean checkGetPut(String[] s,  Pair[] v){
	 return (v.equals(Lens.get(Lens.put(s,v))));
	}
	
	public static void main (String[] args){
		boolean ok=true;
		String[][] s = { { "foo" }, { "foo", "bar", "froboz" },{ "foo", "bar", "froboz" } };
		Pair[][] p = { { new Pair ('f' ,7)}, {new Pair('f',7), new Pair('b',3), new Pair('f',6)}, {new Pair('f',2), new Pair('b',5), new Pair('f',3) } };
		
		for (int i = 0; i < 3; i++) {
			System.out.println(checkGetPut(s[i], p[i]));
			ok = ok && checkGetPut(s[i], p[i]);
			}
		System.out.println(ok);
		}
}
