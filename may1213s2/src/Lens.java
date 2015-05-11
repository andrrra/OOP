public class Lens {
	public static Pair[] get(String[] source) {
		// ADD CODE HERE
		/*
get(new String[] {"foo", "BAR", "frObOz"})
should return the array of Pairs
{[’f’,0],[’B’,3],[’f’,2]}
		 */
		
		Pair[] p = new Pair [source.length];
		for (int i=0;i<source.length;i++){
			p[i]= new Pair(source[i].charAt(0), u(source[i] ) ) ;
		}
		return p;
		
	}
	
	public static int u(String s){
		int nr=0; char c;
		for(int i=0;i<s.length();i++){
			c=s.charAt(i);
			if (Character.isUpperCase(c)==true) nr++;
		}
		return nr;
	}
	
	public static String exes(int nr){
		String x="";
		for (int i=0;i<nr;i++){
			x+="X";
		}
		return x;
	}

	public static String[] create(Pair[] view) {
		// ADD CODE HERE
		String[] s = new String[view.length];
		/*create (new Pair[]
{new Pair(’F’,2), new Pair(’b’,0), new Pair(’f’,5)})
should return the array of Strings
{"FXX", "b", "fXXXXX"}
*/
		for(int i=0;i<view.length;i++){
			s[i]="";
			s[i] = view[i].getChar()+exes(view[i].getInt());
		}
		return s;
		
	}
	
	public static String[] put(String[] oldSource, Pair[] newView) {
		// Check that the old source and new view have same length.
		// If they do not, report an error and stop the whole program.
		if (!(oldSource.length == newView.length)) {
			throw new RuntimeException("Length of view and source didn't match");
		}
		// if we get here at all, we know oldSource.length == newView.length
		// ADD CODE HERE
		for (int i=0;i<oldSource.length;i++){
			if ((Character.toUpperCase(oldSource[i].charAt(0))!=newView[i].getChar() && Character.toLowerCase(oldSource[i].charAt(0))!=newView[i].getChar())==true) System.out.println("First characters don’t match");
			else {
				if (u(oldSource[i])<newView[i].getInt()) {
					oldSource[i]+=exes(newView[i].getInt()-u(oldSource[i]));
				}
			}
		}
		return oldSource;
	} 
	
	public static void main (String[] args){
		Pair[] p = get(new String[] {"foo", "BAR", "frObOz"});
		for (int i=0;i<p.length;i++){
			System.out.print(p[i]);
		}
		String[] s = create (new Pair[] {new Pair('F',2), new Pair('b',0), new Pair('f',5)});
		for (int i=0;i<s.length;i++){
			System.out.print(s[i]);
		}
		String[] f= put (new String[] {"foo", "BAR", "frObOz"}, new Pair[] {new Pair('f',2), new Pair('b',0), new Pair('f',5)});
		for (int i=0;i<f.length;i++){
			System.out.print(f[i]);
		}
		String[] h = put(new String[] {"foo", "bar", "FROBOZ"},new Pair[] {new Pair('f',1), new Pair('b',6), new Pair('f',3)});
		for (int i=0;i<h.length;i++){
			System.out.println(h[i]);
		}

	}
}

