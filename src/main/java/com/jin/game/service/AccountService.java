package com.jin.game.service;

import com.jin.game.model.account.Account;
import com.jin.game.repository.AccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AccountService {

    private AccountRepository accountRepository;

    @Autowired
    public AccountService(AccountRepository accountRepository){
        this.accountRepository = accountRepository;
    }

    public List<Account> retrieveAllAccounts() {
        return accountRepository.findAll();
    }

    public Account retrieveAccount(Long id) {
        Optional<Account> accountOptional = accountRepository.findById(id);
        return accountOptional.orElseThrow(
                ()->new NotFoundException("Account with id " + id + " is not found"));
    }

    public Account createAccount(Account account){
        return accountRepository.save(account);
    }

    public Account updateAccount(Long id, Account account){
        Optional<Account> accountOptional = accountRepository.findById(id);

        if (!accountOptional.isPresent()) {
            throw new NotFoundException("Account with id " + id + " is not found");
        }
        account.setId(id);
        return accountRepository.save(account);
    }

    public void deleteAccount(Long id) {
        accountRepository.deleteById(id);
    }


}
