import static org.junit.Assert.*;

import org.junit.Test;


public class IntersectionCheckTest {

	private Line l1 = new Line(0,0,2,0);
	private Line l2 = new Line(1,1,1,-1);
	private Line l3 = new Line(0,0,1,1);
	private Line l4 = new Line(3,0,4,0);
	private Line[] ls = new Line[] {l2, l3, l4};

	@Test
	public void testLinesIntersect() {
		boolean b = IntersectionCheck.linesIntersect(l1, l2);
	}

	@Test
	public void testGetIntersections() {
		Line[] intersecting = IntersectionCheck.getIntersections(l1, ls);
	}

	@Test
	public void testPrintLine() {
		String s = IntersectionCheck.printLine(l1);
	}

	@Test
	public void testPrintIntersections() {
		String s = IntersectionCheck.printIntersections(ls);
	}
}
