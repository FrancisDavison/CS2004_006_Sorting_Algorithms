import java.util.ArrayList;
import java.util.Random;

public class Lab6
{
	public static void main(String args[])
	{
		int n = 10;
		RandomArray(n);
	}
	
	public static void RandomArray (int n)
	{
		ArrayList<Integer> RandomNumber = new ArrayList<Integer>(n);
		Random rand = new Random();
		for(int i=0;i<n;i++)
		{
			Integer r = Math.abs(rand.nextInt() % 256);
			RandomNumber.add(r);
		}
		RandArrayOut(RandomNumber);
	}
	
	public static ArrayList<Integer> RandArrayOut(ArrayList<Integer> RandomNumber)
	{
		ArrayList<Integer> res = new ArrayList<Integer>();
		res = ThreeSorts.SortC(RandomNumber);
		System.out.println(res);
		return res;
	}
}