package studio7;

import java.util.Scanner;

public class Polygons {
	
	public static int bottom;
	public static int tallness;
	
	public Polygons() {
		bottom = 10;
		tallness = 15;
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
		Polygons l = new Polygons();
		Polygons h = new Polygons();
		Polygons a = new Polygons();
		a.getArea(l.getLength(bottom), h.getHeight(tallness));
		if (bottom == tallness) {
			System.out.println("This is a square");
		} else {
			System.out.println("This is not a square");
		}
		
		System.out.println(a.getArea(l.getLength(bottom), h.getHeight(tallness)));
		
	}
}
