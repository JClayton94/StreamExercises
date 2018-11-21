package streamExercises;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
//Question 1
public class StreamExercises {

	public static void main(String[] args) {
		
		List<String> list = new ArrayList<String>();
		list.add("Hello");
		list.add("boop");
		list.add("dogs");
		List<String> capList = arrayCapitaliser(list); 
		
		//capList.stream().forEach(System.out::println);
		
	}
	public static List<String> arrayCapitaliser(List<String> array){
		
		return array.stream().map(String::toUpperCase).collect(Collectors.toList());
		
	}
}
