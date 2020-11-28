import java.lang.reflect.Array;
import java.util.*;
import java.util.function.Consumer;


class Solution {
	public static void main(String args[]) {

		// Simple Consumer
		Consumer<Integer> c = (a) -> System.out.println(a);
		c.accept(10);

		// Consumer with String List
		Consumer<List<String>> d = list -> {
			list.stream().forEach(a-> System.out.println(a));
		};
		List<String> arr = Arrays.asList("Hello", "Vishal", "Karhade");
		d.accept(arr);
		
		
	}
}
