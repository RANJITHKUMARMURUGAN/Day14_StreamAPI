public class AddressBook9 {
	public static void main(String[] args)
     	{
        // Creating a Stream of Strings
        Stream<String> stream = Stream.of("Ganesh", "Santhosh","Rekha", "Babu","Ranjith");

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
      	}
}
