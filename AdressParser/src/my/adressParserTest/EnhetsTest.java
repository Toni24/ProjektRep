package my.adressParserTest;
import static org.junit.Assert.*;

import java.util.regex.Pattern;

import my.addressParser.FileChooser;
import my.addressParser.Searcher;

import org.junit.Test;
public class EnhetsTest {
	@Test
	public void FileChooser_StartTest(){
	FileChooser choose = new FileChooser();
	assertTrue("File Chooser is active",choose.isEnabled());
	}
	@Test
	public void FileChooser_createImageIcon(){
	FileChooser choose = new FileChooser();
	choose.createAndShowGUI();
	assertNotNull(choose.frame.isActive());
	}
	@Test
	public void Searcher_SearchStreetNumber(){
		Searcher find = new Searcher();
		find.setInput_text("/1 ");
		String streetNo;
		assertNotNull(streetNo = find.streetNumber());
	}
	@Test
	public void Searcher_SearchStreetType(){
		Searcher find = new Searcher();
		find.setInput_text(" ab");
		String StreetTy;
		assertNotNull(StreetTy = find.streetType());
	}
	@Test
	public void Searcher_SearchStreetName(){
		Searcher find = new Searcher();
		find.setInput_text(" working");
		String StreetNa;
		assertNotNull(StreetNa = find.streetName());
	}
	@Test
	public void Searcher_SearchSuburb(){
		Searcher find = new Searcher();
		find.setInput_text(" alfart");
		String subur;
		assertNotNull(subur = find.suburb());
	}
	@Test
	public void Searcher_postCode(){
		Searcher find = new Searcher();
		find.setInput_text("3111");
		String post;
		post = find.postCode();
		System.out.println(post);
		assertNotNull(post = find.postCode());
	}
	@Test
	public void Searcher_isPOBox(){
		Searcher find = new Searcher();
		find.setInput_text(" bOx ");
		assertTrue(find.isPOBox());
	}
	@Test
	public void Searcher_isLockedBag(){
		Searcher find = new Searcher();
		find.setInput_text(" bag ");
		assertTrue(find.isLockedBag());
	}
	@Test
	public void Searcher_flatNumber(){
		Searcher find = new Searcher();
		find.setInput_text(" 23/");
		String flat;
		assertNotNull(flat = find.flatNumber());
	}
}
