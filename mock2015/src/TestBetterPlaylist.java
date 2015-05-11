import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import java.lang.reflect.*;

import java.util.ArrayList;

public class TestBetterPlaylist {
        
        BetterPlaylist a;

        @Before
        public void setUp()  {
	  a = new BetterPlaylist("Edinburgh");
        }

        @Test
        public void testGetAgeRating() {
	  ArrayList<Video> v = new ArrayList<Video>();
	  v.add (new Video("a", 1, 12));
	  v.add (new Video("b", 1, 15));
	  v.add (new Video("c", 1, 12));
	  a.setVideos(v);
	  int ageRating = a.getAgeRating();
	  assertEquals(15, ageRating);
	  // and now just to catch the people who are returning constant 15!
	  ArrayList<Video> v2 = new ArrayList<Video>();
	  v2.add (new Video("a", 1, 12));
	  v2.add (new Video("b", 1, 12));
	  v2.add (new Video("c", 1, 12));
	  a.setVideos(v2);
	  int ageRating2 = a.getAgeRating();
	  assertEquals(12, ageRating2);
        }

        @Test
        public void testGetLength() {
	  ArrayList<Video> v = new ArrayList<Video>();
	  v.add (new Video("a", 1, 12));
	  v.add (new Video("b", 1, 15));
	  v.add (new Video("c", 1, 12));
	  a.setVideos(v);
	  int length = a.getLength();
	  assertEquals(3, length);
        }
}
