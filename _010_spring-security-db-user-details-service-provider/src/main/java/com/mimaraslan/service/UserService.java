package com.mimaraslan.service;

import org.springframework.boot.CommandLineRunner;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.mimaraslan.model.User;
import com.mimaraslan.repository.UserRepository;

import java.util.Arrays;
import java.util.List;

/**
 * 
 @author Huseyin_Aydin
 @since 1994
 @category Spring Boot Security
 * 
 */


@Service
public class UserService implements CommandLineRunner {
	
	private UserRepository userRepository;
	private PasswordEncoder passwordEncoder;

	public UserService(UserRepository userRepository, PasswordEncoder passwordEncoder) {
		this.userRepository = userRepository;
		this.passwordEncoder = passwordEncoder;
	}

	@Override
	public void run(String... args) {
		// Delete all
		this.userRepository.deleteAll();

		// Create users
		User admin = new User("admin", passwordEncoder.encode("admin"), "ADMIN", "ACCESS_TEST1,ACCESS_TEST2");
		User manager = new User("huseyin", passwordEncoder.encode("123"), "MANAGER", "ACCESS_TEST1");
		User katerina = new User("hasan", passwordEncoder.encode("321"), "USER", "");

		List<User> users = Arrays.asList(admin, katerina, manager);

		// Save to DB
		this.userRepository.saveAll(users);
	}
}
