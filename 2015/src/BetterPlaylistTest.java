import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Before;
import org.junit.Test;


public class BetterPlaylistTest {

	BetterPlaylist pl;
	
	@Before
	public void setUp() {
		pl = new BetterPlaylist("Inbetweeners");
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

	@Test
	public void testGetLength() {
		int i = pl.getLength();
	}

	@Test
	public void testGetAgeRating() {
		int i = pl.getAgeRating();
	}

}
