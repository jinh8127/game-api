package com.jin.game.model.items;

import com.jin.game.model.inventory.UserInventory;
import com.jin.game.model.user.User;

import javax.persistence.*;

@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name="item_type", discriminatorType = DiscriminatorType.STRING)
public abstract class EquipItem extends GameItem implements Wearable {

    @ManyToOne
    @JoinColumn(name = "owner_inventory_id")
    UserInventory ownerInventory;
    Integer levelReq;

    Integer strReq;
    Integer dexReq;
    Integer lukReq;
    Integer intReq;

    Integer strength;
    Integer dexterity;
    Integer luck;
    Integer intelligence;

    Integer physicalArmor;
    Integer magicArmor;

    public UserInventory getOwnerInventory() {
        return ownerInventory;
    }

    public void setOwnerInventory(UserInventory ownerInventory) {
        this.ownerInventory = ownerInventory;
    }

}
