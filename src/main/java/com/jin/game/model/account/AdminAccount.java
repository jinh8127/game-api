package com.jin.game.model.account;

import javax.persistence.Column;
import javax.persistence.Entity;

@Entity
public class AdminAccount extends Account{

    @Column(name = "account_type")
    public static final String ACCOUNT_TYPE = "Admin_Account";

    public AdminAccount() {
    }

    public String getAccountType(){
        return this.ACCOUNT_TYPE;
    }
}
