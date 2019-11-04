package txt.java.stream;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class SortedDemo {

	public static void main(String [] args) {
		List<String> list = Arrays.asList("DC", "CD", "AD");

		list.stream().sorted().forEach(new Consumer<String>() {

			@Override
			public void accept(String t) {
				System.out.println(t);
			}
		});
//		list.stream().sorted().forEach(t -> System.out.println(t));

		System.out.println("Pristine in list when sorted: " + list);
	}
}
