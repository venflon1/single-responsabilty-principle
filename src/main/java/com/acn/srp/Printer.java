package com.acn.srp;

import java.util.List;
import java.util.Objects;

public class Printer {

	public static void printIntegers(List<Integer> ints) {
		if( !Objects.isNull(ints) ) {
			ints.forEach(integer -> System.out.print( integer + " " ));
		}
	}
}
