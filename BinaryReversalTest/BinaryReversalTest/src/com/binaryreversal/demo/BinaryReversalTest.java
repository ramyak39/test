package com.binaryreversal.demo;
import java.util.Scanner;

public class BinaryReversalTest {
	public static void main(String... args) {
		@SuppressWarnings("resource")
		Scanner sc= new Scanner(System.in); 
		System.out.print("Enter a string: ");
		Integer i= Integer.parseInt(sc.nextLine()); 
		if(i<0) {
			System.out.println("Invalid input pls enter positive number.");
			System.exit(1);
		}
		StringBuilder binary = new StringBuilder(Integer.toBinaryString(i));
		binary.reverse();
		StringBuilder sb = new StringBuilder("00000000");
		sb.replace(0, binary.length(), binary.toString());
		Integer result = Integer.parseInt(sb.toString(), 2);
		System.out.println(result);
	}
}
