package com.pluralsight.springtx.repositories;

import com.pluralsight.springtx.models.Account;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface AccountRepository extends JpaRepository<Account, Long> {
    List<Account> findByAccountTypeOrderByTransactionDateDesc(String accountType);
}
