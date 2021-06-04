import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
import java.util.stream.Stream;

public class AddressBook10 {
	public static void main(String[] args)
     	{
  
        // Creating a Stream of Strings
        Stream<String> stream = Stream.of("Ganesh", "Santhosh","Rekha", "Babu","Ranjith");
        List<String> stringlist = Arrays.asList("Computer", "Laptop","Mouse", "Keyboard", "Pen", "Gitkey");

        // creating stream of strings
        Stream<String> s = Stream.of("Run","Walk","Jump","Height","Length","Board", "Plane");
  
        // Using Stream filter(Predicate predicate)
        // to get a stream consisting of the
        // elements ending with s
        stream.filter(str -> str.startsWith("S"))
        .forEach(System.out::println);
   
        stream.filter(str -> str.length() > 3)
        .forEach(System.out::println);
     
        //stringlist.stream().sorted().forEach(System.out::println);     
        List<String> sortedList = stringlist.stream().sorted().collect(Collectors.toList());  
	    sortedList.forEach(System.out::println);
	    
	    // counting number of strings in stream
        long count_string =  s.collect(Collectors.counting());
      	System.out.println(count_string);
     }
}
