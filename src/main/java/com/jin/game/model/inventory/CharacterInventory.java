package com.jin.game.model.inventory;

import com.jin.game.model.items.EquipItem;

import javax.persistence.*;
import java.math.BigInteger;
import java.util.List;

@Embeddable
public class CharacterInventory {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private BigInteger id;

    @OneToMany(mappedBy = "ownerInventory")
    private List<EquipItem> equipItems;

    private Integer cashOwned;


    public CharacterInventory() {
    }

    public CharacterInventory(BigInteger id, List<EquipItem> equipItems, Integer cashOwned) {
        this.id = id;
        this.equipItems = equipItems;
        this.cashOwned = cashOwned;
    }

    public BigInteger getId() {
        return id;
    }

    public void setId(BigInteger id) {
        this.id = id;
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
