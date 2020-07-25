import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Collectors;
public class PalindromeCheck
{
	public static boolean isPalindrome(String input)
	{
		return input.equalsIgnoreCase(new StringBuilder().append(input).reverse().toString());
	}
	public static void main(String[] args)
	{
		try (Scanner sc = new Scanner(System.in)) {
			List<String> strings_input = new ArrayList<String>();
			List<String> result_ans;
			Predicate<String> predicate=PalindromeCheck::isPalindrome;
			int noOfStrings;
			
			System.out.print("Enter no of strings : ");
			noOfStrings = sc.nextInt();
			
			System.out.println("Enter strings");
			for(int iter=1;iter<=noOfStrings;iter++)
			{
				strings_input.add(sc.next());
			}
			
			result_ans=strings_input.stream().filter(predicate).collect(Collectors.toList());
			
			System.out.println(result_ans);
		}
	}
}
