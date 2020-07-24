package lamdas_streams;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
public class PalindromeStrings {
	public static void main(String[] args) {
        List<String> al = Arrays.asList("madam","tomato","12321","12341","racecar","malayalam");
        List<String> s= PalindromeStrings.find_Palindrome(al,(str) ->PalindromeStrings.checkPalindrome((String) str));
        System.out.println("List of Palindromes: " +s);
    }
 
    public static boolean checkPalindrome(String string) {
    	StringBuffer sb =new StringBuffer();
    	for(int i = string.length()-1; i >= 0 ; i--)
    		sb = sb.append(string.charAt(i));
    	if(string.equalsIgnoreCase(sb.toString()))
    		return true;
    	else 
    		return false;
    } 
    public static List<String> find_Palindrome(List<String> l, Predicate<String> p) { 
    	List<String> ls = new ArrayList<String>(); 
    	l
    	.stream()
    	.filter((i) -> (p.test((String) i))).forEach((i) -> {
            ls.add((String) i);
        });
        return ls;

}
}
