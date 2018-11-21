package streamExercises;
import java.util.ArrayList;
import java.util.List;

public class streamExercises4 {

	public static void main(String[] args) {
		
		List<Integer> ints = new ArrayList<Integer>();
		ints.add(10);
		ints.add(1234);
		ints.add(121);
		ints.add(2);
		ints.add(78);
		ints.add(2343);
		
		sumEvens(ints);
	}
	public static int sumEvens(List<Integer> intList) {
		
		return intList.stream().filter(toEven -> (toEven % 2 == 0)).mapToInt(i -> i).sum();	
		
	}
}
