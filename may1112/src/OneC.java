import java.util.ArrayList;
import java.util.Arrays;

public class OneC {

    public static int hammingDist(String left, String right) {
        int r=0;
        for (int i =0;i<left.length();i++)
        	if (left.charAt(i)!=right.charAt(i)) r++;
        return r;
    }

    public static String findFarthest(String s, String[] targets) {
    	int max =0;
    	String r="";
        for (int i=0;i<targets.length;i++)
        	if (hammingDist(s,targets[i])>max) {
        		max = hammingDist(s,targets[i]);
        		r = targets[i];
        	}
        return r;
    }

    public static ArrayList<String> findNearestK(String s, String[] targets, int k) {
    	ArrayList<String> r = new ArrayList<String>();
        for (int i=0;i<targets.length;i++)
        	if (hammingDist(s,targets[i])<=k)
        		r.add(targets[i]);
        return r;
    }

    public static int stringDist(String left, String right) {
        if (left.length()>right.length()){
        	String l2=""; int d=-right.length()+left.length();
        	for (int i=0;i<right.length();i++){
        		l2+=left.charAt(i);
        	}
        	return d+hammingDist(l2,right);
        }
        else  if (left.length()<right.length()){
        	String r2=""; int d=right.length()-left.length();
        	for (int i=0;i<left.length();i++){
        		r2+=right.charAt(i);
        	}
        	return d+hammingDist(left,r2);
        }
        else return hammingDist(left,right);
    }
    
    public static void main(String[] args){
    		System.out.println(hammingDist("abaca","apaca"));
    		String[] t={"abaca","aback","abaft","adapt", "accoy"};
    		System.out.println(findFarthest("abaca",t));
    		System.out.println(findNearestK("abaca",t,2).toString());
    		System.out.println(stringDist("heat","hatter"));
    	}
    

}
