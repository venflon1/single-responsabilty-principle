package com.acn.srp;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Scanner;

public class StandardInput {
	private Scanner scanner;
	
	public StandardInput(){
		this.scanner = new Scanner(System.in);
	}
	
	public List<Integer> getIntegersInRange(int numOfInteger, IntRangeNumber rangeNumber) {
		int counterNumberInRange = 0;
		List<Integer> integers = new ArrayList<>();
				
		for(; counterNumberInRange < 5; ) {
			String input =  this.scanner.nextLine();
			if( !ViolationNumberChecker.isValidNumber(input) ) {
				continue;
			}
			
			int number = Integer.parseInt(input); 
			
			if( ViolationNumberChecker.isNumberInRange(number, rangeNumber) ) {
				integers.add( Integer.parseInt(input) );
				counterNumberInRange += 1;
			}
		}
		return integers;
	}
	
	public void close() {
		if( !Objects.isNull(this.scanner) ){
			this.scanner.close();
		}
	}
}