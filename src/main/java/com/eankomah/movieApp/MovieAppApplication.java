package com.eankomah.movieApp;

import com.eankomah.movieApp.entity.Role;
import com.eankomah.movieApp.entity.User;
import com.eankomah.movieApp.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

@SpringBootApplication
@RequiredArgsConstructor
public class MovieAppApplication implements CommandLineRunner {

	private final UserRepository userRepository;

	public static void main(String[] args) {
		SpringApplication.run(MovieAppApplication.class, args);


		}

	public void run(String... args){
		User adminAccount = userRepository.findByRole(Role.ADMIN);
		if(null == adminAccount){
			User user = new User();
			user.setEmail("admin@gmail.com");
			user.setFirstname("admin");
			user.setLastname("admin");
			user.setRole(Role.ADMIN);
			user.setPassword(new BCryptPasswordEncoder().encode("admin"));
			userRepository.save(user);
		}
//		User userAccount = userRepository.findByRole(Role.USER);
//		if(null == userAccount){
//			User user = new User();
//			user.setEmail("user@gmail.com");
//			user.setFirstname("user");
//			user.setLastname("user");
//			user.setRole(Role.USER);
//			user.setPassword(new BCryptPasswordEncoder().encode("admin"));
//			userRepository.save(user);
//		}

	}


}
