package com.novabank.controller;

import com.novabank.dto.AccountResponse;
import com.novabank.dto.CreateAccountRequest;
import com.novabank.service.AccountService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import com.novabank.dto.DepositRequest;
import com.novabank.dto.BalanceResponse;
import com.novabank.dto.WithdrawRequest;
import com.novabank.dto.WithdrawResponse;
@RestController
@RequestMapping("/api/account")
@RequiredArgsConstructor
public class AccountController {

    private final AccountService accountService;

    @PostMapping("/create")
    public AccountResponse createAccount(@RequestBody CreateAccountRequest request) {
        return accountService.createAccount(request);
    }
    @PostMapping("/deposit")
    public BalanceResponse deposit(@RequestBody DepositRequest request) {
        return accountService.deposit(request);
    }
    @PostMapping("/withdraw")
    public WithdrawResponse withdraw(@RequestBody WithdrawRequest request) {
        return accountService.withdraw(request);
    }
}