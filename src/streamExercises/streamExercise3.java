package streamExercises;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
public class streamExercise3 {

	public static void main(String[] args) {
		
		List<String> concat = new ArrayList<String>();
		
		concat.add("Dog");
		concat.add("is");
		concat.add("god!");
		
		System.out.println(concatString(concat));
		

	}
	public static Optional<String> concatString(List<String> array) {
		
		return array.stream().reduce((a, b) -> a + " " + b);
		
	}

}
