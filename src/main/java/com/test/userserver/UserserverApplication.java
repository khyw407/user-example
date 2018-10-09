package com.test.userserver;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.test.userserver.domain.Account;
import com.test.userserver.repository.AccountRepository;

@SpringBootApplication
public class UserserverApplication {

	public static void main(String[] args) {
		SpringApplication.run(UserserverApplication.class, args);
	}
	
	@Bean
	public CommandLineRunner commandLineRunner(AccountRepository accountRepository) {
		return args -> {
			accountRepository.save(new Account("user1", "test1"));
			accountRepository.save(new Account("user2", "test2"));
			accountRepository.save(new Account("user3", "test3"));
		};
	}
}
