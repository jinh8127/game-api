package com.jin.game.model.items;

import com.jin.game.model.items.useable.UpgradeScroll;
import com.jin.game.model.player.PlayerClassType;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import java.util.List;

@Entity
@DiscriminatorValue("Equip")
public class EquipItem extends GameItem {

    private EquipItemType equipItemType;

    private List<PlayerClassType> wearableClassType;

    private Integer levelReq;

    private Integer strReq;

    private Integer dexReq;

    private Integer lukReq;

    private Integer intReq;

    private Integer additionalPhysicalAttack;

    private Integer additionalMagicAttack;

    private Integer additionalStr;

    private Integer additionalDex;

    private Integer additionalLuk;

    private Integer additionalInt;

    private Integer additionalArmour;

    private Integer additionalMagicArmour;

    private Integer currentUpgradeSlotAvailable;

    @Column(updatable = false)
    public Integer maxUpgradeSlot;

    public EquipItem() {
    }

    public EquipItem(EquipItemType equipItemType, List<PlayerClassType> wearableClassType, Integer levelReq, Integer strReq,
                     Integer dexReq, Integer lukReq, Integer intReq, Integer physicalAttack, Integer magicAttack,
                     Integer additionalStr, Integer additionalDex, Integer additionalLuk, Integer additionalInt,
                     Integer additionalArmour, Integer additionalMagicArmour, Integer currentUpgradeSlotAvailable,
                     Integer maxUpgradeSlot) {

        this.equipItemType = equipItemType;
        this.wearableClassType = wearableClassType;
        this.levelReq = levelReq;
        this.strReq = strReq;
        this.dexReq = dexReq;
        this.lukReq = lukReq;
        this.intReq = intReq;
        this.additionalPhysicalAttack = physicalAttack;
        this.additionalMagicAttack = magicAttack;
        this.additionalStr = additionalStr;
        this.additionalDex = additionalDex;
        this.additionalLuk = additionalLuk;
        this.additionalInt = additionalInt;
        this.additionalArmour = additionalArmour;
        this.additionalMagicArmour = additionalMagicArmour;
        this.currentUpgradeSlotAvailable = currentUpgradeSlotAvailable;
        this.maxUpgradeSlot = maxUpgradeSlot;
    }

    public EquipItemType getEquipItemType() {
        return equipItemType;
    }

    public void setEquipItemType(EquipItemType equipItemType) {
        this.equipItemType = equipItemType;
    }

    public List<PlayerClassType> getWearableClassType() {
        return wearableClassType;
    }

    public void setWearableClassType(List<PlayerClassType> wearableClassType) {
        this.wearableClassType = wearableClassType;
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

    public Integer getPhysicalAttack() {
        return additionalPhysicalAttack;
    }

    public void setPhysicalAttack(Integer physicalAttack) {
        this.additionalPhysicalAttack = physicalAttack;
    }

    public Integer getAdditionalMagicAttack() {
        return additionalMagicAttack;
    }

    public void setAdditionalMagicAttack(Integer additionalMagicAttack) {this.additionalMagicAttack = additionalMagicAttack;}

    public Integer getAdditionalStr() {
        return additionalStr;
    }

    public void setAdditionalStr(Integer additionalStr) {
        this.additionalStr = additionalStr;
    }

    public Integer getAdditionalDex() {
        return additionalDex;
    }

    public void setAdditionalDex(Integer additionalDex) {
        this.additionalDex = additionalDex;
    }

    public Integer getAdditionalLuk() {
        return additionalLuk;
    }

    public void setAdditionalLuk(Integer additionalLuk) {
        this.additionalLuk = additionalLuk;
    }

    public Integer getAdditionalInt() {
        return additionalInt;
    }

    public void setAdditionalInt(Integer additionalInt) {
        this.additionalInt = additionalInt;
    }

    public Integer getAdditionalArmour() {
        return additionalArmour;
    }

    public void setAdditionalArmour(Integer additionalArmour) {
        this.additionalArmour = additionalArmour;
    }

    public Integer getAdditionalMagicArmour() {
        return additionalMagicArmour;
    }

    public void setAdditionalMagicArmour(Integer additionalMagicArmour) {
        this.additionalMagicArmour = additionalMagicArmour;
    }

    public Integer getCurrentUpgradeSlotAvailable() {
        return currentUpgradeSlotAvailable;
    }

    public void setCurrentUpgradeSlotAvailable(Integer currentUpgradeSlotAvailable) {
        this.currentUpgradeSlotAvailable = currentUpgradeSlotAvailable;
    }

    public Integer getMaxUpgradeSlot() {
        return maxUpgradeSlot;
    }

    public void setMaxUpgradeSlot(Integer maxUpgradeSlot) {
        this.maxUpgradeSlot = maxUpgradeSlot;
    }

    public void upgrade(UpgradeScroll scroll) {
        this.additionalStr += scroll.getScrollEffectStr();
        this.additionalDex += scroll.getScrollEffectDex();
        this.additionalLuk += scroll.getScrollEffectLuk();
        this.additionalInt += scroll.getScrollEffectInt();
        this.additionalArmour += scroll.getScrollEffectArmour();
        this.additionalMagicArmour += scroll.getScrollEffectMagicArmour();
        this.additionalPhysicalAttack += scroll.getScrollEffectPA();
        this.additionalMagicAttack += scroll.getScrollEffectMA();
        this.currentUpgradeSlotAvailable--;
    }








}
