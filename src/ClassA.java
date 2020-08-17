import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

public class ClassA  {

	public static void main(String[] args) {
		/*String a= "$27.00";
		a = a.substring(1, 3);
		System.out.println(a);
		*/
		
		
		Pattern pattern = Pattern.compile("((xx){1,1})");
		Matcher matcher = pattern.matcher("12xx23xx556xxxyyxrtxx1");
		
		while(matcher.find()) {
		     System.out.println("Found at: "+ matcher.start()
		    		+ 
		    		" - " + matcher.end());
		  }
		}
		//xxx - should not match
		//xxxx - should not match
		//xx  - should match
		//
		/*
		String input = "#" + "xxx23xxx556xxxxyyxrtxxx" + "##";
		char[] charArray = input.toCharArray();
		
		int count = 0;
		
		for(int i =0 ; i<charArray.length ; i++) 
			
		{
			if (i ==0) {
				continue;
			}
			if(charArray[i] == 'x' && charArray[i+1] == 'x' && charArray[i+2] != 'x' && charArray[i-1] !='x'  )
			{
				count = count + 1;
			}
		}
		System.out.println(count);
			
		}
		
	*/
	
	
		/*boolean b = matcher.find();
		int count = matcher.groupCount();
		//matcher.
		
		System.out.println(b + " " + count);
		*/
		
	}


