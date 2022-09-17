package com.jin.game.model.items.useable;

import com.jin.game.model.items.EquipItem;
import com.jin.game.model.items.GameItem;
import com.jin.game.model.player.Player;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("Usable")
abstract class UsableItem extends GameItem {
    
    public UsableItem() {
    }

    public abstract void use(Player player);

    public abstract void use(EquipItem equipItem);

}
