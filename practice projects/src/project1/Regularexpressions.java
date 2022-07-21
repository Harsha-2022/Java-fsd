package project1;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regularexpressions {

	public static void main(String[] args) {
           String pattern ="winchester";
           String check ="dean winchester";
           //Pattern.compile() indicates which pattern is being searched
           Pattern p=Pattern.compile(pattern);
           //matcher() method is used to search for the pattern
           Matcher c =p.matcher(check);
           //find() method is used to return the matched string
           while(c.find()) 
        	   System.out.println(check.substring(c.start(),c.end()));
	}

}
