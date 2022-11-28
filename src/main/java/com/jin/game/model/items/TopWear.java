package com.jin.game.model.items;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "Top_wear")
public class TopWear extends GameItem implements Wearable {

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

    public TopWear() {
    }

    public TopWear(String itemName, ItemType itemType, Boolean isExchangeable, Boolean isDisposable,
                   Integer levelReq, Integer strReq, Integer dexReq, Integer lukReq, Integer intReq, Integer strength,
                   Integer dexterity, Integer luck, Integer intelligence, Integer physicalArmor, Integer magicArmor) {
        super(itemName, itemType, isExchangeable, isDisposable);
        this.levelReq = levelReq;
        this.strReq = strReq;
        this.dexReq = dexReq;
        this.lukReq = lukReq;
        this.intReq = intReq;
        this.strength = strength;
        this.dexterity = dexterity;
        this.luck = luck;
        this.intelligence = intelligence;
        this.physicalArmor = physicalArmor;
        this.magicArmor = magicArmor;
    }

    public Integer getLevelReq() {
        return levelReq;
    }

    public void setLevelReq(Integer levelReq) {
        this.levelReq = levelReq;
    }

    public Integer getStrReq() {
        return strReq;
    }

    public void setStrReq(Integer strReq) {
        this.strReq = strReq;
    }

    public Integer getDexReq() {
        return dexReq;
    }

    public void setDexReq(Integer dexReq) {
        this.dexReq = dexReq;
    }

    public Integer getLukReq() {
        return lukReq;
    }

    public void setLukReq(Integer lukReq) {
        this.lukReq = lukReq;
    }

    public Integer getIntReq() {
        return intReq;
    }

    public void setIntReq(Integer intReq) {
        this.intReq = intReq;
    }

    public Integer getStrength() {
        return strength;
    }

    public void setStrength(Integer strength) {
        this.strength = strength;
    }

    public Integer getDexterity() {
        return dexterity;
    }

    public void setDexterity(Integer dexterity) {
        this.dexterity = dexterity;
    }

    public Integer getLuck() {
        return luck;
    }

    public void setLuck(Integer luck) {
        this.luck = luck;
    }

    public Integer getIntelligence() {
        return intelligence;
    }

    public void setIntelligence(Integer intelligence) {
        this.intelligence = intelligence;
    }

    public Integer getPhysicalArmor() {
        return physicalArmor;
    }

    public void setPhysicalArmor(Integer physicalArmor) {
        this.physicalArmor = physicalArmor;
    }

    public Integer getMagicArmor() {
        return magicArmor;
    }

    public void setMagicArmor(Integer magicArmor) {
        this.magicArmor = magicArmor;
    }

    @Override
    public String toString() {
        return "Topwear{" +
                "levelReq=" + levelReq +
                ", strReq=" + strReq +
                ", dexReq=" + dexReq +
                ", lukReq=" + lukReq +
                ", intReq=" + intReq +
                ", strength=" + strength +
                ", dexterity=" + dexterity +
                ", luck=" + luck +
                ", intelligence=" + intelligence +
                ", physicalArmor=" + physicalArmor +
                ", magicArmor=" + magicArmor +
                ", itemName='" + itemName + '\'' +
                ", itemType=" + itemType +
                ", isExchangeable=" + isExchangeable +
                ", isDisposable=" + isDisposable +
                '}';
    }
}