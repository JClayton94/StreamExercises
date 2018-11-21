package streamExercises;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class streamExercise2 {

	public static void main(String[] args) {

		List<Integer> list = new ArrayList<Integer>();
		list.add(4);
		list.add(6);
		list.add(100);
		List<Integer> primes = primes(list); 

		//primes.stream().forEach(System.out::println);

	}
	public static List<Integer> primes(List<Integer> array){

		return array.stream().filter(primes -> {
			{
				for(int i = 2; i < primes; i++) {
					if(primes % i == 0)
						return false;
				}
				return true;
			}
		}).collect(Collectors.toList());
	}
}



