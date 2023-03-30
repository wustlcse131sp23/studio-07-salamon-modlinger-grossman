package studio7;

import java.util.Scanner;

public class Rectangle {
	
	public static int length;
	public static int height;
	
	public Rectangle() {
		length = 14;
		height = 12;
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
		Rectangle l = new Rectangle();
		Rectangle h = new Rectangle();
		Rectangle a = new Rectangle();
		a.getArea(l.getLength(length), h.getHeight(height));
		if (length == height) {
			System.out.println("This is a square");
		} else {
			System.out.println("This is a rectangle");
		}
		
		System.out.println(a.getArea(l.getLength(length), h.getHeight(height)));
		
	}
}
