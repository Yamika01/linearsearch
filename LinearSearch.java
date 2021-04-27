
public class LinearSearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int list[]= {10,20,30,40,50,60,70};
		int n=40;
		System.out.println("the given list is:");
		for(int i=0;i<list.length;i++) {
			System.out.println(list[i]);
			
	}
		for(int i=0;i<list.length;i++)
		{
			if(list[i]==n)
			{
				System.out.println("the element is present at"+""+i);
			}
		}

}
}
