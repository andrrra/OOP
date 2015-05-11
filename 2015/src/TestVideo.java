import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

public class TestVideo {

        Video video;
        
        @Before
        public void setUp() {
	  video = new Video("foo", 6, 15);
        }

// This will fail if they have fewer than three attributes (allow more, if private)
        @Test
        public void testAttributes1() {
	  Class<?> theClass = video.getClass();
	  Field fields[] = theClass.getDeclaredFields();
	  assertTrue (fields.length >= 3);
	}

// Fails if they haven't got the correct attributes with correct modifiers
        @Test
        public void testAttributes2() {
	  Class<?> theClass = video.getClass();
	  Field fields[] = theClass.getDeclaredFields();
	  boolean foundAtt1 = false;
	  boolean foundAtt2 = false;
	  boolean foundAtt3 = false;
	  for (Field field : fields) {
	    if (field.getName().equals("title")) {
	      foundAtt1 = true;
	      int m = field.getModifiers();
	      assertTrue(Modifier.isPrivate(m));
	      assertFalse(Modifier.isStatic(m));
	    } else {
	      if (field.getName().equals("length")) {
		foundAtt2 = true;
		int m = field.getModifiers();
		assertTrue(Modifier.isPrivate(m));
		assertFalse(Modifier.isStatic(m));
	      } else {
		if (field.getName().equals("ageRating")) {
		  foundAtt3 = true;
		  int m = field.getModifiers();
		  assertTrue(Modifier.isPrivate(m));
		  assertFalse(Modifier.isStatic(m));
		}
	      }
	    }
	  }
	  assertTrue(foundAtt1);
	  assertTrue(foundAtt2);
	}

// This one is seriously hard to fail, in fact, possibly useless...
        @Test
        public void testConstructor() {
                assertNotNull(video);
        }

// Passes if constructor and getter are correct, regardless of setter
        @Test
        public void testGetter1() {
                assertEquals ("foo", video.getTitle());
        }

// Passes if constructor and getter are correct, regardless of setter
        @Test
        public void testGetter2() {
                assertEquals (6, video.getLength());
        }

	// need testGetter3?? TODO

// Passes if they can set attributes at all, never mind error checking
        @Test
        public void testSetter1() {
                video.setTitle("bar");
                assertEquals ("bar", video.getTitle());
        }

// Passes if they can set attributes at all, never mind error checking
        @Test
        public void testSetter2() {
                video.setLength(17);
                assertEquals (17, video.getLength());
        }


	// TODO different use of setter3, setter4

// Passes if they can ensure ageRating is 12,15 or 18
// These marks should only be available if their basic setter works, though, so check that!
// Surprising number of subtle errors in this one, but few enough marks that any error loses them.
        @Test
        public void testSetter3() {
                video.setAgeRating(12);
                assertEquals (12, video.getAgeRating());
                video.setAgeRating(18);
                assertEquals (18, video.getAgeRating());
                video.setAgeRating(7);
                assertEquals (18, video.getAgeRating());
                video.setAgeRating(12);
                assertEquals (12, video.getAgeRating());
                video.setAgeRating(7);
                assertEquals (12, video.getAgeRating());
        }

// Passes if they can default to 18 in constructor
        @Test
        public void testSetter4() {
	  Video v2 = new Video("mung", 65, 10);
	  assertEquals (18, v2.getAgeRating());
        }

        @Test
        public void testToString() {
                String s = video.toString();
		assertEquals ("foo (6 mins), R:15", s);
        }

        @Test
        public void testToStringIgnoreWhitespace() {
                String s = video.toString();
		assertEquals ("foo (6 mins), R:15".replaceAll("\\s",""), s.replaceAll("\\s",""));
        }

}
