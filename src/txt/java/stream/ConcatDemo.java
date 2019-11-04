package txt.java.stream;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Stream;

public class ConcatDemo {
	
	public static void main(String [] args) {
		List<String> list1 = Arrays.asList("A1", "A2", "A3");
		List<String> list2 = Arrays.asList("B1", "B2", "B3");

		Stream<String> resStream = Stream.concat(list1.stream(), list2.stream());
		resStream.forEach(new Consumer<String>() {

			@Override
			public void accept(String t) {
				System.out.println(t);
			}
		});

//		resStream.forEach(s -> System.out.println(s));
	}
}
