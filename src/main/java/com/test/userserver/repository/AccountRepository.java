package com.test.userserver.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.test.userserver.domain.Account;


@RepositoryRestResource(path="/accounts")
public interface AccountRepository extends JpaRepository<Account, Long>{
	Account findByaccountName(String accountname);
}
