import java.util.Scanner;
import java.util.*;
import java.util.function.BiFunction;
public class AverageNumbers
{
	public static void main(String[] args)
	{
		try (Scanner sc = new Scanner(System.in)) {
			int noOfIntegers,avgIntegers;
			ArrayList<Integer> integersList=new ArrayList<Integer>();
			System.out.print("Enter number of elements:");
			noOfIntegers=sc.nextInt();
			System.out.println("Enter elements");
			for(int iterator=1;iterator<=noOfIntegers;iterator++)
			{
				integersList.add(sc.nextInt());
			}
			avgIntegers=avgOfListOfIntegers(integersList,( a, b)->a+b);
		
		System.out.println("Average of given integers is : "+avgIntegers);
		}
	}
	public static int avgOfListOfIntegers(ArrayList<Integer> integers,BiFunction<Integer,Integer,Integer> biFunction)
	{
		int sum=0,average;
		BiFunction<Integer,Integer,Integer> findDiv=(a,b)->a/b;
		for(int num:integers)
		{
			sum=biFunction.apply(sum,num);
		}
		average=findDiv.apply(sum,integers.size());
		return average;
	}
}