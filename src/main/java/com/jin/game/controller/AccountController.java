package com.jin.game.controller;

import com.jin.game.model.account.Account;
import com.jin.game.model.account.AdminAccount;
import com.jin.game.model.account.UserAccount;
import com.jin.game.service.AccountService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.List;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("api/v1/accounts")
public class AccountController {

    private AccountService accountService;


    @GetMapping
    public ResponseEntity<List<Account>> getAccounts(){
        List<Account> accounts = accountService.retrieveAllAccounts();
        return ResponseEntity.ok().body(accounts);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Account> getAccountById(@PathVariable("id") long id) {
        Account account = accountService.retrieveAccount(id);
        return ResponseEntity.ok(account);
    }

    @PostMapping("/userAccount")
    public ResponseEntity<Account> createUserAccount(@RequestBody UserAccount userAccount) {
        Account createdAccount = accountService.createAccount(userAccount);
        URI location = ServletUriComponentsBuilder
                .fromCurrentRequest()
                .path("/{id}")
                .buildAndExpand(createdAccount.getId())
                .toUri();
        return ResponseEntity.created(location).body(createdAccount);
    }

    @PostMapping("/AdminAccount")
    public ResponseEntity<Account> createAdminAccount(@RequestBody UserAccount adminAccount) {
        Account createdAccount = accountService.createAccount(adminAccount);
        URI location = ServletUriComponentsBuilder
                .fromCurrentRequest()
                .path("/{id}")
                .buildAndExpand(createdAccount.getId())
                .toUri();
        return ResponseEntity.created(location).body(createdAccount);
    }

    @PutMapping("UserAccount/{id}")
    public ResponseEntity<Account>  updateAccount(@PathVariable("id") long id,
                                                  @RequestBody UserAccount acc) {
        UserAccount updatedAccount = (UserAccount) accountService.updateAccount(id, acc);
        return ResponseEntity.ok(updatedAccount);
    }

    @PutMapping("AdminAccount/{id}")
    public ResponseEntity<Account>  updateAccount(@PathVariable("id") long id,
                                                  @RequestBody AdminAccount acc) {
        AdminAccount updatedAccount = (AdminAccount) accountService.updateAccount(id, acc);
        return ResponseEntity.ok(updatedAccount);
    }

    @DeleteMapping("/{id}")
    public void deleteAccount(@PathVariable("id") long id) {
        accountService.deleteAccount(id);
    }
}
