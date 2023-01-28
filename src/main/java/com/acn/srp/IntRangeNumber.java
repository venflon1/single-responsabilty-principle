package com.acn.srp;

import lombok.Getter;

@Getter
public class IntRangeNumber {
	private final int min;
	private final int max;
	
	public IntRangeNumber(int min, int max) {
		if(min >= max ) {
			throw new IllegalArgumentException("Min value of range must be strict lower than Max value");
		}
		this.min = min;
		this.max = max;
	}
}