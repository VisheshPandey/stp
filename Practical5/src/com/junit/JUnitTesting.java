package com.junit;

public class JUnitTesting {
	
	public static void main(String[] args) {
		
	}
	
	public int square(int num) {
		return (num*num);
	}
	
	public int countA(String word) {
		int count = 0 ;
		for(int i = 0 ; i < word.length(); i++) {
			if (word.charAt(i) == 'a') {
				count++;
			}
		}
		return count;
	}

}


