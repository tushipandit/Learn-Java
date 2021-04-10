package functionalprogramming;

import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.IntStream;


 class Evennumberpredicate implements Predicate<Integer>
{
	public boolean test(Integer number) {
		return number%2 ==0;
	}
}
 
 
 
 class Systemoutconsumer implements Consumer<Integer>
 {

	@Override
	public void accept(Integer t) {
		// TODO Auto-generated method stub
		System.out.println(t);
	}
	 
 }
 
 class NumberSquareMappper implements Function<Integer , Integer>
 {

	@Override
	public Integer apply(Integer t) {
		// TODO Auto-generated method stub
		return t * t;
	}
	 
 }
 


public class FPRunner {
	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List <String>list = List.of("Apple", "Bannana" , "Car" , "Bike");
		getWithFp(list);
		
		
		List<Integer> val=List.of(1,22,33,44,55);
		int sum = val.stream().reduce(0,(num1,num2)-> num1+num2);
		System.out.println(sum);
		
		List<Integer> val2=List.of(1,22,33,44,55);
		int sum2 = val2.stream().reduce(0,(num1,num2)->{
			System.out.println(num1 + " " + num2);
			return num1+num2;
		});
		System.out.println(sum2);
		
		
		
		
		//Stream intermediate operations are those operations whose input and output are both streams
		
		List<Integer> val3=List.of(2,45,3,678,5,3,56,34,5);
		
		val3.stream().sorted().forEach(e->System.out.println(e));
		val3.stream().sorted().distinct().forEach(e->System.out.println(e));
		val3.stream().sorted().distinct().map(e->e*e).forEach(e->System.out.println(e));
		IntStream.range(1,11).map(e -> e*e).forEach(p-> System.out.println(p));
		
		//map to lowercase
		List.of("Apple" , "Bat" ,"Cat").stream().map(e -> e.toLowerCase()).forEach(p -> System.out.println(p));
		
		
		//Stream terminal operation are those operations whose result is one value
		
		IntStream.range(1,11 ).reduce(0 , (n1 , n2) -> n1+n2);
		List.of(23,12,34,53).stream().max((n1,n2) -> Integer.compare(n1, n2)).get();
		List.of(23,12,34,53).stream().min((n1,n2) -> Integer.compare(n1, n2)).get();
		List.of(23,12,34,53).stream().filter(e -> e%2 ==1).forEach(e -> System.out.println(e));
		List.of(23,12,34,53).stream().filter(e -> e%2 ==1).collect(Collectors.toList());
		
		
		//Boxed is used to convert pipeline into stream type 
		IntStream.range(1, 11).map(e -> e*e).boxed().collect(Collectors.toList());
		
		List.of(23,43,53,45,14,42,16).stream()
		.filter(x ->x%2 ==0)
		.map(x->x *x)
		.forEach(e -> System.out.println(e));
		
		
		//using functionl interface 
		List.of(23,43,53,45,14,42,16)
		.stream()
		.filter(new Evennumberpredicate())
		.map(new NumberSquareMappper())
		.forEach(new Systemoutconsumer());
		
		
		//	.map(x->x *x)
		// <R> Stream<R> map(Function<? super T , ? extends R> mapper);
		// R apply(T t); 
		
		
		//filter(new Evennumberpredicate())
		//Stream<t> filter(Predicate<? super t>Predicate)
		//boolean test(t t);
		
		//.forEach(e -> System.out.println(e));
		//Consumer<? super T>action
		//void accept(T t);
		
		
		
		
		
		
		
		
	}
	
	

	private static void getWithFp(List<String> list)
	{
		list
		.stream()
		.filter(element -> element.endsWith("a"))
		.forEach(
				element -> System.out.println(element)) ;
	}
	

}
