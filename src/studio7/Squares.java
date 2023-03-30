package studio7;

import java.util.Scanner;

public class Squares {
	
	public static int base;
	public static int width;
	
	public Squares() {
		base = 7;
		width = 9;
	}

	public int getLength(int length) {
		return length;
	}
	
	public int getHeight(int height) {
		return height;
	}
	
	public int getArea(int length, int height) {
		return length * height;
	}
	
	public static void main(String[] args) {
		Squares l = new Squares();
		Squares h = new Squares();
		Squares a = new Squares();
		a.getArea(l.getLength(base), h.getHeight(width));
		if (base == width) {
			System.out.println("This is a square");
		} else {
			System.out.println("This is not a square");
		}
		
		System.out.println(a.getArea(l.getLength(base), h.getHeight(width)));
		
	}
}
