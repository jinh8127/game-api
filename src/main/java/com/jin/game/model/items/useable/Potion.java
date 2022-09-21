package com.jin.game.model.items.useable;

import com.jin.game.model.items.GameItem;
import com.jin.game.model.player.Player;

import javax.persistence.Entity;

@Entity
public class Potion extends GameItem implements Usable<Player> {

    private Integer recoveryHP;

    private Integer recoveryMP;

    public Potion() {
    }

    public Potion(Integer recoveryHP, Integer recoveryMP) {
        this.recoveryHP = recoveryHP;
        this.recoveryMP = recoveryMP;
    }

    @Override
    public void use(Player player) {
        player.recoverHpByAmount(this.recoveryHP);
        player.recoverMpByAmount(this.recoveryMP);
    }

}
