package com.jin.game.model.items.useable;

import com.jin.game.model.items.EquipItem;
import com.jin.game.model.items.GameItem;
import com.jin.game.model.player.Player;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("UpgradeScroll")
public class UpgradeScroll extends GameItem implements Usable<EquipItem> {

    private Double successRate;

    private Integer scrollEffectStr;

    private Integer scrollEffectDex;

    private Integer scrollEffectLuk;

    private Integer scrollEffectInt;

    private Integer scrollEffectPA;

    private Integer scrollEffectMA;

    private Integer scrollEffectArmour;

    private Integer scrollEffectMagicArmour;


    public Double getSuccessRate() {
        return successRate;
    }

    public void setSuccessRate(Double successRate) {
        this.successRate = successRate;
    }

    public Integer getScrollEffectStr() {
        return scrollEffectStr;
    }

    public void setScrollEffectStr(Integer scrollEffectStr) {
        this.scrollEffectStr = scrollEffectStr;
    }

    public Integer getScrollEffectDex() {
        return scrollEffectDex;
    }

    public void setScrollEffectDex(Integer scrollEffectDex) {
        this.scrollEffectDex = scrollEffectDex;
    }

    public Integer getScrollEffectLuk() {
        return scrollEffectLuk;
    }

    public void setScrollEffectLuk(Integer scrollEffectLuk) {
        this.scrollEffectLuk = scrollEffectLuk;
    }

    public Integer getScrollEffectInt() {
        return scrollEffectInt;
    }

    public void setScrollEffectInt(Integer scrollEffectInt) {
        this.scrollEffectInt = scrollEffectInt;
    }

    public Integer getScrollEffectPA() {
        return scrollEffectPA;
    }

    public void setScrollEffectPA(Integer scrollEffectPA) {
        this.scrollEffectPA = scrollEffectPA;
    }

    public Integer getScrollEffectMA() {
        return scrollEffectMA;
    }

    public void setScrollEffectMA(Integer scrollEffectMA) {
        this.scrollEffectMA = scrollEffectMA;
    }

    public Integer getScrollEffectArmour() {
        return scrollEffectArmour;
    }

    public void setScrollEffectArmour(Integer scrollEffectArmour) {
        this.scrollEffectArmour = scrollEffectArmour;
    }

    public Integer getScrollEffectMagicArmour() {
        return scrollEffectMagicArmour;
    }

    public void setScrollEffectMagicArmour(Integer scrollEffectMagicArmour) {
        this.scrollEffectMagicArmour = scrollEffectMagicArmour;
    }


    public void use(EquipItem equipItem){
        equipItem.upgrade(this);
    }

}
