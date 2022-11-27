package com.jin.game.model.account;

import javax.persistence.*;

@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name="account_type", discriminatorType = DiscriminatorType.STRING)
public abstract class Account {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    protected Long id;

    protected String loginID;

    protected String password;

    public Long getId() {
        return id;
    }
    public void setId(Long id) {
    }

}
