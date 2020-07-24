package lamdas_streams;
import java.util.*;
public class Average {
	public static void main(String[] args) {
		List<Integer> num = Arrays.asList(10,15,5,8,45,43);
		double avg = Average.doaverage(num);
		System.out.println(avg);
	  }
	private static double doaverage(List <Integer> marks) {
	    if (marks == null || marks.isEmpty()) {
	        return 0;
	    }
	    double sum = 0;
	    for (Integer mark : marks) {
	        sum += mark;
	    }
	    return sum / marks.size();
	}
}
