package org.edu;

public class Arts extends Education {
	public void bsc() {
		System.out.println("Physics");
		System.out.println("tamil");
		
	}
	public void bEd() {
		System.out.println("Chemistry");
	}
	public void bA() {
		System.out.println("English");
	}
	public void ug() {
		System.out.println("B.E");
	}
	public void pg() {
		System.out.println("M.com");
	}
	public static void main(String[] args) {
		Arts l = new Arts();
		l.bsc();
		l.bEd();
		l.bA();
		l.ug();
		l.pg();
	}}
