import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Before;
import org.junit.Test;


public class SimplePlaylistTest {

	SimplePlaylist pl;
	
	@Before
	public void setUp() {
		pl = new SimplePlaylist("Inbetweeners", 200, 15);
	}

	@Test
	public void testGetVideos() {
		ArrayList<Video> v = pl.getVideos();
	}

	@Test
	public void testSetVideos() {
		// using null as the videos argument to maximise students'
		// chance of passing this basic test
		pl.setVideos(null);
	}

	@Test
	public void testToString() {
		String s = pl.toString();
	}

}
