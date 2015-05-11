import static org.junit.Assert.*;

import org.junit.Test;

import java.io.*;

import java.util.Arrays;

public class TestIntersectionCheck {


	@Test
	public void testLinesIntersectItself() {
	  Line l1 = new Line(-3,0,7,0);
	  assertFalse(IntersectionCheck.linesIntersect(l1,l1));
	}

	@Test
	public void testLinesIntersectEqual() {
	  Line l1 = new Line(-3,0,7,0);
	  Line l2 = new Line(-3,0,7,0);
	  assertTrue(IntersectionCheck.linesIntersect(l1,l2));
	}

	@Test
	public void testLinesIntersectT() {
	  Line l1 = new Line(-3,0,7,0);
	  Line l2 = new Line(-1,-11,2,10);
	  assertTrue(IntersectionCheck.linesIntersect(l1,l2));
	}

	@Test
	public void testLinesIntersectT2() {
	  Line l1 = new Line(3,10,4,-10);
	  Line l2 = new Line(-1,-11,4,-10);
	  assertTrue(IntersectionCheck.linesIntersect(l1,l2));
	}

	@Test
	public void testLinesIntersectF() {
	  Line l1 = new Line(-3,0,7,0);
	  Line l2 = new Line(-1,-11,2,-10);
	  assertFalse(IntersectionCheck.linesIntersect(l1,l2));
	}

	@Test
	public void testLinesIntersectF2() {
	  Line l1 = new Line(3,10,4,-10);
	  Line l2 = new Line(-1,-11,2,0);
	  assertFalse(IntersectionCheck.linesIntersect(l1,l2));
	}

	@Test
	public void testGetIntersections() {
	  Line l1 = new Line(-3,0,7,0);
	  Line l2 = new Line(-1,-11,2,10);
	  Line l3 = new Line(-1,-11,2,-10);
	  Line[] ints = IntersectionCheck.getIntersections(l1, new Line[] {l1,l2,l3});
	  assertEquals(1, ints.length);
	  assertEquals(l2, ints[0]);
	}

  // Some of them return arrays that are too long, but with the right elements at the start.
	@Test
	public void testGetIntersectionsPadded() {
	  Line l1 = new Line(-3,0,7,0);
	  Line l2 = new Line(-1,-11,2,10);
	  Line l3 = new Line(-1,-11,2,-10);
	  Line[] ints = IntersectionCheck.getIntersections(l1, new Line[] {l1,l2,l3});
	  assertEquals(l2, ints[0]);
	}

  // problem is that that may fail because their linesIntersect is
  // wrong. Let's try to see whether that could be the problem.
  // Here is some correct getIntersections code, calling their linesIntersect. If their
  // getIntersections gives the same answers as this, be suspicious that we may be in that situation.
  private static Line[] myGetIntersections(Line currentLine, Line[] allLines) {
    int count = 0;
    for (Line l : allLines) {
      if (IntersectionCheck.linesIntersect(currentLine, l)) count++;
    }
    Line[] result = new Line[count];
    int j = 0;
    for (int i = 0; i < allLines.length; i++) {
      if (IntersectionCheck.linesIntersect(currentLine, allLines[i])) {
	result[j++] = allLines[i];
      }
    }
    return result;
  }

  // make this pass if their getIntersections code is correct and their linesIntersect code isn't, but 
  // try not to let it pass through randomness! In particular, include some lines that almost everyone's
  // linesIntersect will correctly say intersect l1, so we don't just compare empty arrays.
	@Test
	public void testGetIntersections2() {
	  Line l1 = new Line(-3,0,7,0);
	  Line l2 = new Line(-1,-11,2,10);
	  Line l3 = new Line(-1,-11,2,-10);
	  Line l4 = new Line(-3,0,7,0);
	  Line l5 = new Line(3,6,7,0);
	  Line[] ints = IntersectionCheck.getIntersections(l1, new Line[] {l1,l2,l3,l4,l5});
	  Line[] ints2 = myGetIntersections(l1, new Line[] {l1,l2,l3,l4,l5});
	  assertArrayEquals(ints2,ints);
	}

  // And the same thing to see whether the problem is padding! 
	@Test
	public void testGetIntersections2Padded() {
	  Line l1 = new Line(-3,0,7,0);
	  Line l2 = new Line(-1,-11,2,10);
	  Line l3 = new Line(-1,-11,2,-10);
	  Line[] ints = IntersectionCheck.getIntersections(l1, new Line[] {l1,l2,l3});
	  Line[] ints2 = myGetIntersections(l1, new Line[] {l1,l2,l3});
	  if (ints.length == 0 || ints2.length == 0) {
	    fail(); // nothing to salvage!
	  } else {
	    assertEquals(ints[0], ints2[0]);
	  }
	}

	@Test
	public void testPrintLine() {
	  Line l1 = new Line(-3.141,0,7.198,0);
	  String s = IntersectionCheck.printLine(l1);
	  assertEquals("(-3.1,0.0) to (7.2,0.0)".replaceAll("\\s",""), s.replaceAll("\\s",""));
	}

  // Need a version that will give them some marks if they do it with wrong rounding - how exactly?
	@Test
	public void testPrintLine2() {
	  Line l1 = new Line(-3.141,0,7.198,0);
	  String s = IntersectionCheck.printLine(l1);
	  // must contain the right principle digits:
	  assertTrue(s.indexOf('3') >= 0);
	  assertTrue(s.indexOf('0') >= 0);
	  assertTrue(s.indexOf('7') >= 0);
	  // and have the right kind of form; try cutting out all digits!
	  assertEquals("(-3.1,0.0) to (7.2,0.0)".replaceAll("\\d","").replaceAll("\\s",""), 
		       s.replaceAll("\\d","").replaceAll("\\s",""));
	}

	@Test
	public void testPrintIntersections() {
	  Line l1 = new Line(-3,0,7,0);
	  Line l2 = new Line(-1,-11,2,10);
	  Line l3 = new Line(-1,-11,2,-10);
	  String s = IntersectionCheck.printIntersections(new Line[] {l1,l2,l3});
	  // use their printLine to avoid double penalising
	  String sCorrect = "Line "+IntersectionCheck.printLine(l1)+"intersects with:\n"+IntersectionCheck.printLine(l2)+"\n";
	  sCorrect += "Line "+IntersectionCheck.printLine(l2)+"intersects with:\n"+IntersectionCheck.printLine(l1)+"\n";
	  sCorrect += IntersectionCheck.printLine(l3)+"\n";
	  sCorrect += "Line "+IntersectionCheck.printLine(l3)+"intersects with:\n"+IntersectionCheck.printLine(l2);
	  assertEquals(sCorrect.replaceAll("\\s",""), s.replaceAll("\\s",""));
	}

  // Sigh. That will fail if their getIntersections or printLine is
  // wrong, so now let's have a version of printIntersections that
  // uses their versions. Let's just give them the marks if
  // this gives the right answer?

private static String myPrintIntersections(Line[] allLines) {
	String result = "";
	for (int i = 0; i < allLines.length; i++) {
		Line li = allLines[i];
		Line[] ints = IntersectionCheck.getIntersections(li, allLines);
		if (ints.length > 0) {
			result += "Line "+IntersectionCheck.printLine(li)+" intersects with:\n";
			for (int j = 0; j < ints.length; j++) {
				result += IntersectionCheck.printLine(ints[j]) + "\n";
			}
		}
	}
	return result;
}


	@Test
	public void testPrintIntersections2() {
	  Line l1 = new Line(-3,0,7,0);
	  Line l2 = new Line(-1,-11,2,10);
	  Line l3 = new Line(-1,-11,2,-10);
	  String theirs = IntersectionCheck.printIntersections(new Line[] {l1,l2,l3});
	  String my = myPrintIntersections(new Line[] {l1,l2,l3});
	  assertEquals(my.replaceAll("\\s",""), theirs.replaceAll("\\s",""));
	}

}
