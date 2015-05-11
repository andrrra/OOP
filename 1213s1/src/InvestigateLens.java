
public class InvestigateLens {
	
	public static boolean checkGetPut(String[] s, Pair[] v){
		return (Lens.get(Lens.put(s, v))==v);
	}
	
	public static void main(String[] args){
		String[] s1 = {"foo"};
		String[] s2 = {"foo", "bar", "froboz"};
		Pair[] p1 = {new Pair('f', 7)};
		Pair[] p2 = {new Pair('f', 7),new Pair('b', 3), new Pair('f', 6)};
		Pair[] p3 = {new Pair ('f', 2), new Pair('b', 5), new Pair('f', 3)};
		System.out.println(checkGetPut(s1, p1));
		System.out.println(checkGetPut(s2,p2));
		System.out.println(checkGetPut(s2,p3));
		System.out.println(checkGetPut(s1,p1)&&checkGetPut(s2,p2)&&checkGetPut(s2,p3));
		
	}

}
