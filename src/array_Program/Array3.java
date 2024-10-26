package array_Program;

import java.util.Arrays;

public class Array3 {
	public static void main(String[] args) {
		String name[] = new String[5];
		name[0] = "Harry";
		name[1] = "John";
		name[2] = "Tom";
		name[3] = "Jerry";
		name[4] = "Pooja";
		for (int i = 0; i < name.length; i++) {
			System.out.println(name[i]);
		}
		System.out.println("*************");
		Arrays.sort(name);
		System.out.println("After Sorting");
		for (int i = 0; i < name.length; i++) {
			System.out.println(name[i]);
		}
		System.out.println("*************");
		for (int i = name.length - 1; i >= 0; i--) {
			System.out.println(name[i]);
		}
	}
}
