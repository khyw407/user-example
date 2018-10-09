package com.test.userserver.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.test.userserver.domain.Account;
import com.test.userserver.repository.AccountRepository;

@Service
public class AccountService {
	@Autowired
	private AccountRepository accountRepository;
	
	public Account selectAccount(String accountName){
		return accountRepository.findByaccountName(accountName);
	}
}
