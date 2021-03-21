package com.susheelkb.romannumeral.util;

import java.util.LinkedHashMap;
import java.util.Map;

public class RomanNumsAppConstants {
	public static final Integer MIN_NUMBER_TO_CONVERT = 1;
	public static final Integer MAX_NUMBER_TO_CONVERT = 3999;

	public static final Map<Integer, String> CORRESPONDING_ROMAN = new LinkedHashMap<Integer, String>();

	static {
		CORRESPONDING_ROMAN.put(1000, "M");
		CORRESPONDING_ROMAN.put(900, "CM");
		CORRESPONDING_ROMAN.put(500, "D");
		CORRESPONDING_ROMAN.put(400, "CD");
		CORRESPONDING_ROMAN.put(100, "C");
		CORRESPONDING_ROMAN.put(90, "XC");
		CORRESPONDING_ROMAN.put(50, "L");
		CORRESPONDING_ROMAN.put(40, "XL");
		CORRESPONDING_ROMAN.put(10, "X");
		CORRESPONDING_ROMAN.put(9, "IX");
		CORRESPONDING_ROMAN.put(5, "V");
		CORRESPONDING_ROMAN.put(4, "IV");
		CORRESPONDING_ROMAN.put(1, "I");

	}	
}
