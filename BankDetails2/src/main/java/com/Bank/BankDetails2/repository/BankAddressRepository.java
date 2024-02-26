package com.Bank.BankDetails2.repository;


import com.Bank.BankDetails2.entity.BankAddress;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BankAddressRepository extends JpaRepository<BankAddress, Long> {
}
