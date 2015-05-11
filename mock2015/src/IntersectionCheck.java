import java.awt.geom.Line2D;
import java.text.DecimalFormat;

public class IntersectionCheck {
	
	public static boolean linesIntersect(Line line1, Line line2){
		if (line1 == line2) return false;
		Line2D a = new Line2D.Double(line1.getX1(), line1.getY1(), line1.getX2(), line1.getY2());
		Line2D b = new Line2D.Double(line2.getX1(), line2.getY1(), line2.getX2(), line2.getY2());
		return a.intersectsLine(b);
	}
	
	public static Line[] getIntersections(Line currentLine, Line[] allLines){
		int count = 0;
		for (Line l : allLines){
			if(linesIntersect(currentLine, l)) count++;
		}
		int j=0;
		Line[] r = new Line[count];
		for (int i=0;i<allLines.length;i++){
			if(linesIntersect(currentLine, allLines[i])) r[j++]=allLines[i];
		}
		return r;
	}
	
	public static String printLine(Line segment){
		DecimalFormat f = new DecimalFormat("0,0");
		return ("("+f.format(segment.getX1()*10)+","+f.format(segment.getY1()*10)+")  to  ("+f.format(segment.getX2()*10)+","+f.format(segment.getY2()*10)+")");
		}
	
	public static String printIntersections(Line[] allLines){
		String r = "";
		for (int i = 0; i < allLines.length; i++) {
			Line l = allLines[i];
			Line[] ints = getIntersections(l, allLines);
			if (ints.length > 0) {
				r += "Line "+printLine(l)+" intersects with:\n";
				for (int j = 0; j < ints.length; j++) {
					r += printLine(ints[j]) + "\n";
				}
			}
		}
		return r;
	}
	
	public static void main(String[] args){
		 Line l1 = new Line(-3.141,0,7.198,0);
		  String s = IntersectionCheck.printLine(l1);
		  System.out.print(s);
	}
	
	

}
