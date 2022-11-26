package com.jin.game.model.user;

import com.jin.game.model.inventory.UserInventory;

import javax.persistence.*;
import java.math.BigInteger;

@Entity
@Table(name = "user")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "user_id", nullable = false)
    private BigInteger id;

    private String userName;
    private String password;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "inventory_id", referencedColumnName = "id")
    private UserInventory inventory;

    public void setId(BigInteger id) {
    }
}