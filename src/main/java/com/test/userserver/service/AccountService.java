package com.test.userserver.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.test.userserver.domain.Account;
import com.test.userserver.repository.AccountRepository;

@Service
public class AccountService {
	@Autowired
	private AccountRepository accountRepository;
	
	/*
	 * Input Type	: String
	 * Output Type	: Account
	 * Description	: accountName을 통해 Account 정보를 조회하는 Service를 구현
	 */
	public Account selectAccount(String accountName){
		return accountRepository.findByaccountName(accountName);
	}
}
