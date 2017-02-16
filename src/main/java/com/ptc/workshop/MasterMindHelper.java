package com.ptc.workshop;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MasterMindHelper {

	List<String> validCodes = Arrays.asList(new String[] {"r", "g", "b", "o", "y", "p"});

	private List<String> secretCode = new ArrayList<String>();
	
	public MasterMindHelper(String code1, String code2, String code3, String code4) {
		for (String color : getCodes(code1, code2, code3, code4)) {
			if (!validCodes.contains(color.toLowerCase())) {
				throw new IllegalArgumentException("Invalid code");
			}
			if (secretCode.contains(color.toLowerCase())) {
				throw new IllegalArgumentException("No repetation allowed");
			}
			secretCode.add(color.toLowerCase());
		}
	}
	
	private String[] getCodes(String... codes) {
		return codes;
	}

	@Override
	public String toString() {
		return secretCode.toString();
	}
}
