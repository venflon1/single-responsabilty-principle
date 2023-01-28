package com.acn.srp;

import java.util.Objects;

public class ViolationNumberChecker {

	public static boolean isValidNumber(String input) {
		if( Objects.isNull(input) ) {
			return false;
		}
		
		try {
			Integer.parseInt(input);
		} catch( NumberFormatException ex ) {
			return false;
		}
		
		return true;
	}

	public static boolean isNumberInRange(int number, IntRangeNumber rangeNumber) {
		if( Objects.isNull(rangeNumber) || 
			Objects.isNull(rangeNumber.getMin()) || 
			Objects.isNull(rangeNumber.getMax())) {
			return false;
		}
		return number >= rangeNumber.getMin() && number <= rangeNumber.getMax();
	}
}