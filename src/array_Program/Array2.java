package array_Program;

import java.util.Scanner;

public class Array2 {
	public static void main(String[] args) {
		int size;
		System.out.println("Enter the size of Array");
		Scanner sc = new Scanner(System.in);
		size = sc.nextInt();
		System.out.println("Size of Array = " + size);
		int a[] = new int[size];// array declaration
		System.out.println("Enter the Elements: ");
		for (int i = 0; i < size; i++) {
			a[i] = sc.nextInt();
		} // accepting values from user
		System.out.println("Array Elements are: ");
		for (int i = 0; i < size; i++) {
			System.out.println(a[i]);
		} // printing my array
	}
}
