package com.test.userserver.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.test.userserver.domain.Account;
import com.test.userserver.service.AccountService;

@Controller
public class AccountController {
	
	@Autowired
	private AccountService accountService;
	
	@RequestMapping("/account/{accountName}")
	@ResponseBody
	public ResponseEntity<Account> getAccount(@PathVariable String accountName){
		ResponseEntity<Account> re = new ResponseEntity<>(accountService.selectAccount(accountName), HttpStatus.OK);
		return re;
	}
}
