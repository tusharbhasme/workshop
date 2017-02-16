package com.ptc.workshop;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class MasterMindHelperTest {

	@Test
	public void testValidCode() {
		MasterMindHelper helper = new MasterMindHelper("r", "g", "b", "o");
		assertEquals("[r, g, b, o]", helper.toString());
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void testInvalidColorCode() {
		MasterMindHelper helper = new MasterMindHelper("r", "g", "b", "xyz");
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void testInvalidColorCode2() {
		MasterMindHelper helper = new MasterMindHelper("r", "33", "b", "3");
	}
	
	/*@Test(expected = IllegalArgumentException.class)
	public void testInvalidColorCount_lessCodes() {
		MasterMindHelper helper = new MasterMindHelper("r", "g", "b");
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void testInvalidColorCount_excessCodes() {
		MasterMindHelper helper = new MasterMindHelper("r", "g", "b", "y", "o");
	}*/
	
	@Test
	public void testColorCodeIgnoreCase() {
		MasterMindHelper helper = new MasterMindHelper("r", "G", "b", "Y");
		assertEquals("[r, g, b, y]", helper.toString());
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void testColorCodeRepetation() {
		MasterMindHelper helper = new MasterMindHelper("r", "G", "r", "Y");
	}
}
