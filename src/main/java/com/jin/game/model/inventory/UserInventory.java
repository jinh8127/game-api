package com.jin.game.model.inventory;

import com.jin.game.model.items.EquipItem;
import com.jin.game.model.items.GameItem;
import com.jin.game.model.items.Useable;
import com.jin.game.model.items.Wearable;
import com.jin.game.model.user.User;

import javax.persistence.*;
import java.math.BigInteger;
import java.util.List;
import java.util.Map;

@Entity
public class UserInventory {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private BigInteger id;

    @OneToOne
    @JoinColumn(name = "user_id")
    private User user;

    @OneToMany(mappedBy = "ownerInventory")
    private List<EquipItem> equipItems;

    private Integer cashOwned;


    public UserInventory() {
    }

    public UserInventory(BigInteger id, User user, List<EquipItem> equipItems, Integer cashOwned) {
        this.id = id;
        this.user = user;
        this.equipItems = equipItems;
        this.cashOwned = cashOwned;
    }

    public BigInteger getId() {
        return id;
    }

    public void setId(BigInteger id) {
        this.id = id;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public List<EquipItem> getEquipItems() {
        return equipItems;
    }

    public void setEquipItems(List<EquipItem> equipItems) {
        this.equipItems = equipItems;
    }

    public Integer getCashOwned() {
        return cashOwned;
    }

    public void setCashOwned(Integer cashOwned) {
        this.cashOwned = cashOwned;
    }
}
