package com.Bank.BankDetails2.controller;


import com.Bank.BankDetails2.entity.BankAddress;
import com.Bank.BankDetails2.entity.BankServices;
import com.Bank.BankDetails2.repository.BankAddressRepository;
import com.Bank.BankDetails2.repository.BankServiceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@Controller
@RequestMapping("/bank")
public class BankController {

    @Autowired
    private BankAddressRepository bankAddressRepo;

    @GetMapping("/alladdress")
    public String getAllAddresses(Model model) {

        String bankName = "Dummy Bank";
        model.addAttribute("bankName", bankName);

        List<BankAddress> bankAddresses = bankAddressRepo.findAll();
        model.addAttribute("bankName", bankName);
        model.addAttribute("bankAddresses", bankAddresses);

        return "branch";
    }

    @Autowired
    private BankServiceRepository bankServiceRepo;

    @GetMapping("/allservices")
    public String getAllServices(Model model) {
        String bankName = "Dummy Bank";
        model.addAttribute("bankName", bankName);

        List<BankServices> bankServices = bankServiceRepo.findAll();
        model.addAttribute("bankName", bankName);
        model.addAttribute("bankServices", bankServices);
        return "service";
    }

}
