package StreamApi;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamApiDemoAToZ {

	public static void main(String[] args) {
		List<Integer> nums = Arrays.asList(1, 4,13 , 7,4,19,2);
		
		nums.forEach(n -> System.out.print(n+ ", "));  // 1, 4, 13, 7, 4, 19, 2,
		
		Stream<Integer> data = nums.stream();
		Stream<Integer>  mappedData = data.map(n -> n*2);
		mappedData.forEach(n-> System.out.println(n));
		
		System.out.println("------------------------------------------------------------------");
		// OR 
		
		nums.stream()
		.filter(n-> n%2==0)
		.map(n ->n*2)
		.sorted()
		.forEach(n -> System.out.println(n));
	
		System.out.println("------------------------------------------------------------------");
	int result =	nums.stream()
		.filter(n-> n%2==0)
		.map(n ->n*2)
		.sorted()
		.reduce(0, (x,y)->x+y);   //  4+8+8=20
		System.out.println(result);

	}

}
