package com.jin.game.model.account;

import com.jin.game.model.user.User;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class UserAccount extends Account{
    @OneToOne
    @JoinColumn(name = "user_id")
    private User user;

    @Column(name = "account_type")
    public static final String ACCOUNT_TYPE = "User_Account";

    @Column(columnDefinition = "boolean default false")
    public boolean isSuspended;


    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public boolean isSuspended() {
        return isSuspended;
    }

    public void setSuspended(boolean suspended) {
        isSuspended = suspended;
    }

    public String getAccountType(){
        return this.ACCOUNT_TYPE;
    }

    public UserAccount() {
    }

    @Override
    public String toString() {
        return "UserAccount{" +
                "user=" + user +
                ", isSuspended=" + isSuspended +
                ", id=" + id +
                ", loginID='" + loginID + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
