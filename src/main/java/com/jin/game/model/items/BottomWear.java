package com.jin.game.model.items;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "bottom_wear")
public class BottomWear extends GameItem implements Wearable {

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

    public BottomWear(){
    }

}