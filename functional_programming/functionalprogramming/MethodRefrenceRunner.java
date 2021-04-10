package functionalprogramming;

import java.util.List;
import java.util.function.Function;

public class MethodRefrenceRunner {

	public static void print(Integer num)
	{
		System.out.println(num);
	}
	
	
	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		
		Function<? super String, ? extends Integer> lengthmap = extractedmethod();
		List.of("Ant" , "Bat" , "Cat" ,"Dog" , "Elephant").stream()
		.map(lengthmap)
		.forEach(s-> System.out.println(s));
		
		
		List.of("Ant" , "Bat" , "Cat" ,"Dog" , "Elephant").stream()
		.map(String :: length)
		.forEach(MethodRefrenceRunner::print);
		
	}


	private static Function<? super String, ? extends Integer> extractedmethod() {
		return s -> s.length();
	}

}
