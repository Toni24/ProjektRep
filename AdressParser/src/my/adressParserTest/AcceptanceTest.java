package my.adressParserTest;
import static org.junit.Assert.*;
import my.addressParser.FileChooser;
import org.junit.Test;
public class AcceptanceTest {
	@Test
	public void adress_Acceptance() throws Exception{
		FileChooser choose = new FileChooser();
		choose.createAndShowGUI();
		assertTrue(choose.isEnabled());
		choose.frame.dispose();
		assertFalse(choose.isDisplayable());
	}
}
