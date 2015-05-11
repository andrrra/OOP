import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import java.lang.reflect.*;

import java.util.ArrayList;

public class TestSimplePlaylist {
        
        SimplePlaylist a;

        @Before
        public void setUp()  {
	  a = new SimplePlaylist("Edinburgh", 150, 18);
        }

// This fails if their constructor crashes - it does happen!
        @Test
        public void testConstructor() {
                assertNotNull(a);
        }

// This fails if they forget the extends
        @Test
        public void testExtends() {
               assertEquals("Video", a.getClass().getSuperclass().getName());
        }

        @Test
        public void testSetGetVideos() {
	  ArrayList<Video> v = new ArrayList<Video>();
	  v.add (new Video("a", 1, 15));
	  a.setVideos(v);
	  ArrayList<Video> vv = a.getVideos();
	  assertEquals(v, vv);
        }


// NB toString1 duplicates toString1IgnoreWhitespace, because the paper didn't fully specify
// whitespace so I don't want to penalise issues with it, but also don't want to change automarker!
        @Test
        public void testToString1() {
                String s = a.toString().replaceAll("\\s","");
                String correct = "Edinburgh (150 mins), R:18\nShowing:".replaceAll("\\s","");
                String alsoCorrect = "Edinburgh\nShowing:".replaceAll("\\s","");
		boolean b = correct.equals(s) || alsoCorrect.equals(s);
                assertTrue(b);
        }

        @Test
        public void testToString1IgnoreWhitespace() {
                String s = a.toString().replaceAll("\\s","");
                String correct = "Edinburgh (150 mins), R:18\nShowing:".replaceAll("\\s","");
                String alsoCorrect = "Edinburgh\nShowing:".replaceAll("\\s","");
		boolean b = correct.equals(s) || alsoCorrect.equals(s);
                assertTrue(b);
        }

        @Test
        public void testToString1IgnoreNWCs() {
                String s = a.toString().replaceAll("\\W","");
                String correct = "Edinburgh (150 mins), R:18\nShowing:".replaceAll("\\W","");
                String alsoCorrect = "Edinburgh\nShowing:".replaceAll("\\W","");
		boolean b = correct.equals(s) || alsoCorrect.equals(s);
                assertTrue(b);
        }


  //nb actually ignores whitespace
        @Test
        public void testToStringSingleItem() {
                String sE = "Edinburgh (150 mins), R:18\nShowing:\nFoo (10 mins), R:12";
                String sEA = "Edinburgh\nShowing:\nFoo (10 mins), R:12";
                Video v1 = new Video("Foo", 10, 12);
		ArrayList<Video> vs = new ArrayList<Video>();
		vs.add(v1);
                a.setVideos(vs);
                String sA = a.toString();
		boolean b = sE.replaceAll("\\s","").equals(sA.replaceAll("\\s",""));
		boolean bA = sEA.replaceAll("\\s","").equals(sA.replaceAll("\\s",""));
		assertTrue(b || bA);
        }

  //nb actually ignores whitespace
        @Test
        public void testToString2() {
                String sE = "Edinburgh (150 mins), R:18\nShowing:\nFoo (10 mins), R:12\nBar (15 mins), R:15";
                String sEA = "Edinburgh\nShowing:\nFoo (10 mins), R:12\nBar (15 mins), R:15";
                Video v1 = new Video("Foo", 10, 12);
                Video v2 = new Video("Bar", 15, 15);
		ArrayList<Video> vs = new ArrayList<Video>();
		vs.add(v1);
		vs.add(v2);
                a.setVideos(vs);
                String sA = a.toString();
		boolean b = sE.replaceAll("\\s","").equals(sA.replaceAll("\\s",""));
		boolean bA = sEA.replaceAll("\\s","").equals(sA.replaceAll("\\s",""));
		assertTrue(b || bA);
        }

        @Test
        public void testToString2IgnoreNWCs() {
                String sE = "Edinburgh (150 mins), R:18\nShowing:\nFoo (10 mins), R:12\nBar (15 mins), R:15";
                String sEA = "Edinburgh\nShowing:\nFoo (10 mins), R:12\nBar (15 mins), R:15";
                Video v1 = new Video("Foo", 10, 12);
                Video v2 = new Video("Bar", 15, 15);
		ArrayList<Video> vs = new ArrayList<Video>();
		vs.add(v1);
		vs.add(v2);
                a.setVideos(vs);
                String sA = a.toString();
		boolean b = sE.replaceAll("\\W","").equals(sA.replaceAll("\\W",""));
		boolean bA = sEA.replaceAll("\\W","").equals(sA.replaceAll("\\W",""));
		assertTrue(b || bA);
        }


  // Taking care not to stop the test compiling if they forget the extends!
        @Test
        public void testToString3() {
          if (a.getClass().getSuperclass().getName().equals("Video")) {
            try {
              (Video.class.cast(a)).setTitle("Glasgow");
            } catch (ClassCastException x) {fail("Class cast failed unexpectedly");}
            String s = a.toString().replaceAll("\\W","");
            String correct = "Glasgow (150 mins), R:18\nShowing:".replaceAll("\\W","");
            String alsoCorrect = "Glasgow\nShowing:".replaceAll("\\W","");
	    boolean b = correct.equals(s) || alsoCorrect.equals(s);
	    assertTrue(b);
          } else {fail();}
        }


}
