package txt.java.stream;

import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.function.Function;
import java.util.stream.Collectors;

import txt.java.model.Person;

public class CollectorsMapToList {

	public static void main(String[] args) {
		Map<Integer, String> map = new HashMap<>();
		map.put(23, "Mahesh");
		map.put(10, "Suresh");
		map.put(26, "Dinesh");
		map.put(11, "Kamlesh");

		// Simple Map to List Example
		System.out.println("------Simple Map to List Example------");
		System.out.println("1. onvert Map Values to List");
		List<String> valueList = map.values().stream().collect(Collectors.toList());
		valueList.forEach(v -> System.out.println(v + "  "));

		System.out.println("2. Convert Map Values to List using sort");
		List<String> sortedValueList = map.values().stream().sorted().collect(Collectors.toList());
		sortedValueList.forEach(v -> System.out.println(v + "  "));

		System.out.println("3. Convert Map keys to List");
		List<Integer> keyList = map.keySet().stream().collect(Collectors.toList());
		keyList.forEach(n -> System.out.println(n));

		System.out.println("4. Convert Map keys to List using sort");
		List<Integer> sortedKeyList = map.keySet().stream().sorted().collect(Collectors.toList());
		sortedKeyList.forEach(n -> System.out.println(n));


		// Convert Map to List of User Object Example
		System.out.println("------Convert Map to List of User Object Example------");
		List<Person> personLst = map.entrySet().stream()
				.sorted(Comparator.comparing(new Function<Entry<Integer, String>, Integer>() {

					@Override
					public Integer apply(Entry<Integer, String> e) {
						return e.getKey();
					}

				})).map(new Function<Entry<Integer, String>, Person>() {

					@Override
					public Person apply(Entry<Integer, String> e) {
						return new Person(e.getKey(), e.getValue());
					}
				}).collect(Collectors.toList());
		
//		personLst = map.entrySet().stream().sorted(Comparator.comparing(e -> e.getKey()))
//				.map(e -> new Person(e.getKey(), e.getValue())).collect(Collectors.toList());
		
		personLst.forEach(p -> System.out.println(p.getId() + ", " + p.getName()));
	}
}
