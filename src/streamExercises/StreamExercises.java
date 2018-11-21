package streamExercises;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamExercises {

	public static void main(String[] args) {
		
		List<String> list = new ArrayList<String>();
		list.add("Hello");
		list.add("boop");
		list.add("dogs");
		
		
	}
	public List<String> arrayCapitaliser(List<String> array){
		
		return array.stream().map(String::toUpperCase).collect(Collectors.toList());
		
	}

}
