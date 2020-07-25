
import java.util.function.Predicate;
import java.util.stream.*;
import java.util.*;
public class StringLength3
{
	public static void main(String[] args)
	{
		try (Scanner sc = new Scanner(System.in)) {
			int noOfStrings,iter;
			List<String> strings_out=new ArrayList<String>();
			List<String> result_obtain;
			
			System.out.print("Enter the total no of strings : ");
			noOfStrings=sc.nextInt();
			
			System.out.println("Enter names for the strings");
			for(iter=1;iter<=noOfStrings;iter++)
			{
				strings_out.add(sc.next());
			}
			
			result_obtain=getStringsOfLengthThree(strings_out);
			
			System.out.println(result_obtain);
		}
	}
	public static List<String> getStringsOfLengthThree(List<String> strings)
	{
		Predicate<String> predicate = (str)->str.length()==3&&str.startsWith("a");
		List<String> result;
		result=strings.stream().filter(predicate).collect(Collectors.toList());
		return result;
	}
}