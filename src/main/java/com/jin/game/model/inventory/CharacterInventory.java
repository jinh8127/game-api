package com.jin.game.model.inventory;

import com.jin.game.model.items.EquipItem;

import javax.persistence.*;
import java.util.List;

@Embeddable
public class CharacterInventory {

    @OneToMany
    @JoinColumn(name="GameCharacter_id")
    private List<EquipItem> equipItems;

    private Integer cashOwned;


    public CharacterInventory() {
    }

    public CharacterInventory(List<EquipItem> equipItems, Integer cashOwned) {
        this.equipItems = equipItems;
        this.cashOwned = cashOwned;
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
