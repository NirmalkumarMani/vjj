
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Parallel {

	public static void main(String[] args) {

		List<Integer> ss = Arrays.asList(1,2,3,4,5,6,7,8,9,10,11,12,13,14,15);
		List<Integer> result = new ArrayList<Integer>();
		 
		Stream<Integer> stream = ss.parallelStream();
       
		stream.map(s -> {
		        synchronized (result) {
		          if (result.size() < 15) {
		            result.add(s);
		          }
		        }
				return s;
		    }).forEach( System.out::println);
		System.out.println(result);   
         Stream<List<String>> namesOriginalList = Stream.of(
	    Arrays.asList("Pankaj"), 
	    Arrays.asList("David", "Lisa"),
	    Arrays.asList("Amit"));

        Stream<String> flatStream = namesOriginalList
    	.flatMap(strList -> strList.stream());
     

        flatStream.forEach(System.out::println);
          .filter(s -> {
        System.out.println("filter: " + s);
        return s.startsWith("A"); 
        System.out.println(s);
		 
	}
}
