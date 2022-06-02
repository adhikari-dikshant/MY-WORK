package JavaAssignment;

import java.util.Scanner;

class Sort {
	void sortInterger(int a[]) {
		for (int i = 0; i < a.length; i++) {
			for (int j = i + 1; j < a.length; j++) {
				if (a[i] > a[j]) {
					int temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}
	}

	void sortString(String str[]) {
		String temp;
		for (int i = 0; i < str.length; i++) {
			for (int j = i + 1; j < str.length; j++) {
				if (str[i].compareTo(str[j]) > 0) {
					temp = str[i];
					str[i] = str[j];
					str[j] = temp;
				}
			}
		}
	}
}

public class Sorting {
	public static void main(String[] args) {
		Sort obj = new Sort();
		Scanner in = new Scanner(System.in);
		int choice;
		do {
			System.out.println(" ****MENU****");
			System.out.println(" 1.SORT INTEGER ARRAY\n 2.SORT STRING ARRAY");
			System.out.println("ENTER THE CHOICE");
			int ch = in.nextInt();
			switch (ch) {
				case 1:
					System.out.println("ENTER THE SIZE OF ARRAY: ");
					int n = in.nextInt();
					System.out.println("ENTER THE NUMBERS:");
					int arr[] = new int[n];
					for (int i = 0; i < n; i++)
						arr[i] = in.nextInt();
					obj.sortInterger(arr);
					System.out.println("SORTED NUMBERS IN ARRAY :");
					for (int i = 0; i < n; i++)
						System.out.print(arr[i] + " ");
					break;
				case 2:
					String names[] = { "RAM", "SHYAM", "SEETA", "GEETA", "REETA" };
					obj.sortString(names);
					for (int i = 0; i < names.length; i++)
						System.out.print(names[i] + " ");
					break;
			}
			System.out.println("\nDO YOU WANT TO CONTINUE 1 OR 0?");
			choice = in.nextInt();
		} while (choice == 1);
	}
}
