import java.util.Scanner;

public class LinearSearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int list[] = { 10, 20, 30, 40, 50, 60, 70 };
		System.out.println("this is a linear search program");
		Scanner sc =new Scanner(System.in);
		System.out.print("enter the element to search:");
		int n=sc.nextInt();
		int isFound=0;
		
			for (int i = 0; i < list.length; i++) 
			{
				if (list[i] == n) 
				{
					isFound=1;
					System.out.println("the element is found at" +i +"position");
				}	
			}
			if(isFound==0)
			{
				System.out.println("the element is not found");
			}
			
		

	}
}
