package com.Bank.BankDetails2.repository;


import com.Bank.BankDetails2.entity.BankServices;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BankServiceRepository extends JpaRepository<BankServices, Long> {
}
