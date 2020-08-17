import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
public class AnagramTest 
{
	public static void main(String[] args) 
	{
		List<String> testList = new ArrayList<>();		
		testList.add("zode");
		testList.add("code");
		testList.add("odec");
		testList.add("doec");
		testList.add("coed");
		testList.add("anagram");
		testList.add("gramana");
		testList.add("gramanas");		
		System.out.println(funWithAnagrams(testList));			
	}
		
	public static List<String> funWithAnagrams(List<String> text) {		
		for(int i = 0 ; i< text.size() ; i++) 
		{
			char[] first = text.get(i).toCharArray();
			Arrays.sort(first);
			
			for(int j = i+1 ; j< text.size() ; j++) 
			{
				char[] second = text.get(j).toCharArray();
				Arrays.sort(second);
				
				if(Arrays.equals(first, second)) 
				{
					text.remove(j);
					j--;
				}}	}		
		Collections.sort(text);
		return text;
		
	}

}
