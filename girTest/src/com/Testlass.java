package com;

public class Testlass {
	
	public static void main(String[] args) {
		TestGit  testGit = new TestGit();
		int sum = testGit.sum(1,2);
		System.out.println("sum"+sum);
	}
	
	private String deal(String a){
		return a+1;
	}

}
