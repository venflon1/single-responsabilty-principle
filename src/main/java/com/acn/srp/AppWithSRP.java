package com.acn.srp;

import java.util.Collections;
import java.util.List;

public class AppWithSRP {
	public static final int THRESHOLD = 5;
	 
	public static void main(String[] args) {
        System.out.println("Welcome to the Application!");

        // get number inputs from user in range [x,y]
		StandardInput standardInput = new StandardInput();
		List<Integer> ints = standardInput.getIntegersInRange(THRESHOLD, new IntRangeNumber(0,10));
        standardInput.close();
        
        Collections.sort(ints);
        
        Printer.printIntegers(ints);
    }

}