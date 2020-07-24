package lamdas_streams;
import java.util.*;
import java.util.stream.Collectors;
public class Strings_startwith_a {
	public static List<String> search(List<String> list) {
		return list.stream().filter(s -> s.startsWith("a") && s.length()==3).collect(Collectors.toList());
		}
		public static void main(String[] args) {
			List<String> al = new ArrayList<String>();
			 al.add("application"); 
		     al.add("are"); 
		     al.add("klef");
		     al.add("air");
		     al.add("dedeepya");
		     al.add("aka");
		     al.add("and");
		     al.add("amp");
		     al.add("end");
		     List<String> str = search(al); 
		     System.out.println("Three letter string that starts with character 'a' : "+str);

		}
}
