import java.util.Scanner;

public class Repeatation
{
	public static void main(String[] args)
	{
		Scanner in =  new Scanner(System.in);
		int n = in.nextInt();
		int[] a = new int[n];
		for(int i = 0; i < n; i++)
		{
			a[i] = in.nextInt();
		}
		int count = 1;
		int maxCount = 0;
		int element = 0;
		for(int i = 0; i < n; i++)
		{
			for(int j = i+1 ; j < n ; j++)
			{
				if(a[i] == a[j])
				{
					count = count + 1;
				}
			}
			if(maxCount < count)
			{
				maxCount = count;
				element = a[i];
			}
		}
		System.out.println(element);
	}
}
