import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;


public class VideoTest {

	Video v;
	
	@Before
	public void setUp() {
		v = new Video("The Inbetweeners", 100, 15);
	}

	@Test
	public void testGetTitle() {
		String s = v.getTitle();
	}

	@Test
	public void testSetTitle() {
		v.setTitle("The Inbetweeners 2");
	}

	@Test
	public void testGetLength() {
		int i = v.getLength();
	}

	@Test
	public void testSetLength() {
		v.setLength(99);
	}

	@Test
	public void testGetAgeRating() {
		int i = v.getAgeRating();
	}

	@Test
	public void testSetAgeRating() {
		v.setAgeRating(18);
	}
	
	@Test
	public void testToString() {
		String s = v.toString();
	}

}
