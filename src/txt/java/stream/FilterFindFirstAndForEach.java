package txt.java.stream;

import java.util.List;

import txt.java.model.User;

public class FilterFindFirstAndForEach {
	
	public static void main(String[] args) {
		List<User> list = User.getUsers();
		System.out.println("------Using findFirst()------");
		
		User user = list.stream().filter(u -> u.getName().endsWith("sh")).findFirst().orElse(null);
		System.out.println(user.getName());
		
		System.out.println("\n------Using forEach()------");
		list.stream().filter(u -> u.getName().endsWith("sh")).forEach(u -> System.out.println(u.getName()));
	}
}
