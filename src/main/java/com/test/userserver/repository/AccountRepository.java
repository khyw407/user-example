package com.test.userserver.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.test.userserver.domain.Account;

/*
 * Description : 스프링 데이터 리포지토리를 사용하여 accountname를 기반으로 Account 정보를 조회할 수 있도록 한다.
 */
@RepositoryRestResource(path="/accounts")
public interface AccountRepository extends JpaRepository<Account, Long>{
	Account findByaccountName(String accountname);
}
