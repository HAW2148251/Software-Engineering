import org.junit.*;
import static org.junit.Assert.*;

public class BoardTest
{
	Board board = new Board();

	public void initialize()
	{
		board = new Board();
	}
		
	@Test
	public void testHasWinner()
	{
		assertFalse(hasWinner);
	}

	@Test
	public void validMark()
	{
		setMark(o,0,0);
	}

	@Test
	public void validMark() throws Exception
	{
		setMark(o,0,0);
		setMark(o,1,0);
		setMark(o,2,0);
	}

	@Test
	public void validMark() throws Exception
	{
		setMark(o,4,2);
	}
}
