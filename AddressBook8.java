public class AddressBook8 {
	public static void main(String[] args)
    {
        // Creating a Stream of Strings
        Stream<String> stream = Stream.of("Ganesh", "Santhosh","Rekha", "Babu","Ranjith");
  
        // Using Stream filter(Predicate predicate)
        // to get a stream consisting of the
        // elements ending with s
        stream.filter(str -> str.startsWith("S"))
        .forEach(System.out::println);
   
        stream.filter(str -> str.length() > 3)
        .forEach(System.out::println);
    }
}
