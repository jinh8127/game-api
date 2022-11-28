package com.jin.game.model.items;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "Helmet")
public class Helmet extends EquipItem implements Wearable {

    public Helmet(String itemName, ItemType itemType, Boolean isExchangeable, Boolean isDisposable, Integer levelReq, Integer strReq, Integer dexReq, Integer lukReq, Integer intReq, Integer strength, Integer dexterity, Integer luck, Integer intelligence, Integer physicalArmor, Integer magicArmor) {
        super(itemName, itemType, isExchangeable, isDisposable, levelReq, strReq, dexReq, lukReq, intReq, strength, dexterity, luck, intelligence, physicalArmor, magicArmor);
    }

    public Helmet() {
        super();
    }


}
