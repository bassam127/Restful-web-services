package com.bassam.test.webservices.restfulwebservices.user;

import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

@Component
public class UserDao {
	private static List<User> users = new ArrayList<>();
	private static int userCount = 3;
	static {
		users.add(new User(85, "Bassam", LocalDate.of(2005, Month.DECEMBER, 5)));
		users.add(new User(58, "lolo", LocalDate.of(2005, Month.JANUARY, 5)));
		users.add(new User(99, "Mahmoud", LocalDate.of(2005, Month.MARCH, 8)));
	}

	public List<User> findAll() {
		return users;
	}

	public User addUser(User user) {
		if (user.getId() == null) {
			user.setId(++userCount);
		}
		users.add(user);
		return user;
	}

	public User findUserById(int id) {
		for (User user : users) {
			if (user.getId() == id) {
				return user;
			}
		}
		return null;
	}
}
