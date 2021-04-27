import java.util.Scanner;

public class Array {

	public static void main(String[] args) {

		System.out.println("enter the size of array:");
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		int numbers[] = new int[size];
		System.out.println("enter the elements in the array:");
		for (int index = 0; index < numbers.length; index++)
		{
			numbers[index] = sc.nextInt();
		}
		

		System.out.println("this is a linear search program");

		System.out.print("enter the element to search:");
		int n = sc.nextInt();
		int position = linearSearch(numbers, n);
		// System.out.println(position);
		if (position == -1)
		{
			System.out.println("the number is not found");
		}
		else
		{
			System.out.println("the number is found at " + position + " position");
		}
	}

	public static int linearSearch(int[] array, int ele) {

		for (int i = 0; i < array.length; i++)
		{
			if (array[i] == ele) {

				return i;
			}
		}

		return -1;

	}

}
